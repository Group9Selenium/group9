package Twitter;

import base.CommonAPI;
import io.restassured.response.ValidatableResponse;
import reporting.TestLogger;

import static io.restassured.RestAssured.given;

public class TweetsClient extends BaseTwitter {

    protected final static String USER_TIMELINE_ENDPOINT = "/statuses/user_timeline.json";
    protected final static String TWEET_ENDPOINT = "/statuses/update.json";
    protected final static String DESTROY_ENDPOINT = "/statuses/destroy.json";

    public ValidatableResponse getUserTimeline() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return given().auth().oauth(apiKey, apiSecretKey, accessToken, accessTokenSecret)
                .when().get(getFullUrl(USER_TIMELINE_ENDPOINT)).then();
    }

    public ValidatableResponse createTweet(String tweet) {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return given().auth().oauth(apiKey, apiSecretKey, accessToken, accessTokenSecret)
                .param("status", tweet).when().post(getFullUrl(TWEET_ENDPOINT)).then();
    }

    public ValidatableResponse deleteTweet(Long tweetId) {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return given().auth().oauth(apiKey, apiSecretKey, accessToken, accessTokenSecret)
                .queryParam("id", tweetId).when().post(getFullUrl(DESTROY_ENDPOINT)).then();
    }
}
