import Twitter.TweetsClient;
import base.CommonAPI;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;
import io.restassured.response.ValidatableResponse;
import org.apache.http.HttpStatus;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.*;
import reporting.ExtentManager;
import reporting.ExtentTestManager;
import reporting.TestLogger;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.util.*;

import static org.hamcrest.Matchers.hasValue;
import static org.hamcrest.Matchers.not;

public class TweetsTest {
    //region Extent Report Listener
    public static ExtentReports extent;

    @BeforeSuite
    public void extentSetup(ITestContext context) {
        ExtentManager.setOutputDirectory(context);
        extent = ExtentManager.getInstance();
    }

    @BeforeMethod
    public void startExtent(Method method) {
        String className = method.getDeclaringClass().getSimpleName();
        String methodName = method.getName().toLowerCase();
        ExtentTestManager.startTest(method.getName());
        ExtentTestManager.getTest().assignCategory(className);
    }

    protected String getStackTrace(Throwable t) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        t.printStackTrace(pw);
        return sw.toString();
    }

    @AfterMethod
    public void afterEachTestMethod(ITestResult result) {
        ExtentTestManager.getTest().getTest().setStartedTime(getTime(result.getStartMillis()));
        ExtentTestManager.getTest().getTest().setEndedTime(getTime(result.getEndMillis()));

        for (String group : result.getMethod().getGroups()) {
            ExtentTestManager.getTest().assignCategory(group);
        }

        if (result.getStatus() == 1) {
            ExtentTestManager.getTest().log(LogStatus.PASS, "Test Passed");
        } else if (result.getStatus() == 2) {
            ExtentTestManager.getTest().log(LogStatus.FAIL, getStackTrace(result.getThrowable()));
        } else if (result.getStatus() == 3) {
            ExtentTestManager.getTest().log(LogStatus.SKIP, "Test Skipped");
        }
        ExtentTestManager.endTest();
        extent.flush();
        /*if (result.getStatus() == ITestResult.FAILURE) {
            captureScreenshot(driver, result.getName());
        }*/
        //driver.quit();
    }

    @AfterSuite
    public void generateReport() {
        extent.close();
    }

    private Date getTime(long millis) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        return calendar.getTime();
    }
    //endregion

    protected TweetsClient tweetsClient;
    protected long tweetId;
    protected List<Long> tweetIdList;

    @BeforeClass
    public void setUp() {
        this.tweetsClient = new TweetsClient();
        // List for all the tweet ids which will be used for cleanup
        this.tweetIdList = new ArrayList<Long>();
    }

    @Test(description = "Retrieves the user's tweets from their timeline")
    public void testGetUserTimeline() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        this.tweetsClient.getUserTimeline();
    }

    @Test(description = "User can successfully tweet")
    public void testUserCanTweet() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        String tweet = "Test " + UUID.randomUUID();
        ValidatableResponse response = this.tweetsClient.createTweet(tweet);
        response.statusCode(HttpStatus.SC_OK);
        this.tweetId = response.extract().body().path("id");
        this.tweetIdList.add(this.tweetId);
    }

    @Test(description = "User unsuccessfully tweets the same tweet twice")
    public void testUserCannotTweetTheSameTweetTwiceInARow() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        String tweet = "Test " + UUID.randomUUID();
        ValidatableResponse response = this.tweetsClient.createTweet(tweet);
        response.statusCode(HttpStatus.SC_OK);
        this.tweetId = response.extract().body().path("id");
        this.tweetIdList.add(this.tweetId);
        response = this.tweetsClient.createTweet(tweet);
        response.statusCode(HttpStatus.SC_FORBIDDEN);
    }

    @Test(dependsOnMethods = {"testUserCanTweet"}, description = "User can successfully delete a tweet", enabled = false)
    public void testUserCanDeleteTweet() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ValidatableResponse response = this.tweetsClient.deleteTweet(this.tweetId);
        response.statusCode(HttpStatus.SC_OK)
                .and()
                .body("$", not(hasValue(this.tweetId)));
    }

    @AfterClass(description = "Deletes all the tweets created by the tests")
    public void cleanUp() {
        if (this.tweetIdList != null) {
            for (Long tweetId : this.tweetIdList) {
                this.tweetsClient.deleteTweet(tweetId);
            }
        }
    }
}
