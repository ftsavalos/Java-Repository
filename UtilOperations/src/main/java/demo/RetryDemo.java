package demo;

import demo.utils.TimeTracking;
import org.junit.Assert;

import java.net.HttpURLConnection;
import java.net.URL;

import static demo.utils.UtilOperations.retry;

public class RetryDemo {

    public static void main(String[] args) {

        TimeTracking time;

        time = retry(5, () -> Assert.assertTrue(connectToURL("localhost:8080")));
        System.out.println(time);
    }

    public static boolean connectToURL(String URLName) {

        try {
            HttpURLConnection.setFollowRedirects(false);
            HttpURLConnection con = (HttpURLConnection) new URL(URLName)
                    .openConnection();
            con.setRequestMethod("HEAD");
            return (con.getResponseCode() == HttpURLConnection.HTTP_OK);
        } catch (Exception e) {
            return false;
        }
    }
}