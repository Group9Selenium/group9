package Twitter;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import reporting.ExtentManager;
import reporting.ExtentTestManager;

import java.io.*;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

public class BaseTwitter {

    protected String baseUri;
    protected String apiKey;
    protected String apiSecretKey;
    protected String accessToken;
    protected String accessTokenSecret;
    private Properties properties = new Properties();
    private InputStream inputStream = null;

    public BaseTwitter() {
        // sets the base URI
        this.baseUri = "https://api.twitter.com/1.1";
        try {
            inputStream = new FileInputStream("/Users/anour/GDrive/Projects/Intellij/Group9/RestAPI/src/main/resources/Keys.properties");
            properties.load(inputStream);
            apiKey = properties.getProperty("apiKey");
            apiSecretKey = properties.getProperty("apiSecretKey");
            accessToken = properties.getProperty("accessToken");
            accessTokenSecret = properties.getProperty("accessTokenSecret");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public String getFullUrl(String endpoint) {
        return baseUri + endpoint;
    }

}
