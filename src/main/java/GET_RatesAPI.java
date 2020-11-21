import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import org.junit.Assert;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class GET_RatesAPI {
    public static Response response;

    public void callGET(String url)
    {
        response = get(url);
    }

    public void verifySuccessStatusCode(int expectedStatusCode)
    {
        int statusCode = response.getStatusCode();
        System.out.println("Actual status code "+statusCode);
        Assert.assertEquals(statusCode,expectedStatusCode);
    }

    public void verifyJSonResponse(String key, String val)
    {
        response.then().body(key, equalToObject(val));
    }

    public void verifyIncorrectStatusCode(int expectedStatusCode)
    {
        int statusCode = response.getStatusCode();
        System.out.println("Actual status code "+statusCode);
        Assert.assertEquals(statusCode,expectedStatusCode);
    }
}
