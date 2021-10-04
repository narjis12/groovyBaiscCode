package hello;
import io.restassured.RestAssured;
import org.testng.annotations.Test;
public class Halo {

    @Test
    public void hi()
    {//log

         RestAssured.given().basePath("").queryParam("").log().all().when().get("").then().log().all();
//log

    }

}
