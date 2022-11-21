package utilities;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class Authentication {

    public static String  generateToken() {

        RequestSpecification spec= new RequestSpecBuilder().setBaseUri("https://www.medunna.com").build();

        /*
        {
  "password": "string",
  "rememberMe": true,
  "username": "string"
}
         */
        // Set the expected data/ beklenen datayi ekle
        Map<String,Object> data=new HashMap<>();
        data.put("username","team4");
        data.put("password","12345678");
        data.put("rememberMe",true);

        // Set the URl
        spec.pathParams("first","api","second","authenticate");

        // Send the Request and get the Response / Request gonder response elde et
        Response response=given().spec(spec).contentType(ContentType.JSON).body(data).when().post("/{first}/{second}");
       // response.prettyPrint();

        JsonPath json=response.jsonPath();
        System.out.println("token : " + json.getString("id_token"));

    return json.getString("id_token");
    }

}
