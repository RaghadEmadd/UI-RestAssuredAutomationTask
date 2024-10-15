import io.restassured.http.ContentType;
import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestCases {
    String baseUrl="https://reqres.in/";
    JSONObject jsonObject= new JSONObject();

    @Test
    void verifyGetMethod(){
       Response response = RestAssured.given()
               .contentType(ContentType.JSON)
               .pathParam("pageNumber","2")
               .log().all()
               .when()
               .get(baseUrl + "api/users?page={pageNumber}");
       response.then().log().all()
               .assertThat()
               .statusCode(200)
               .body("page", Matchers.equalTo(2));
    }
    @Test
    public void verifyPostMethod(){
        jsonObject.put("name", "Rag");
        jsonObject.put("job", "teacher");
        Response response= RestAssured.given()
                .contentType(ContentType.JSON)
                .body(jsonObject.toJSONString())
                .log().all()
                .when()
                .post(baseUrl + "api/users");
        response.then().log().all()
                .assertThat()
                .statusCode(201)
                .body("createdAt" , Matchers.notNullValue());
    }
    @Test
    public void verifySuccessfulDeleteMethod(){
        Response response= RestAssured.given()
                .contentType(ContentType.JSON)
                .pathParam("pageNumber","2")
                .log().all()
                .when()
                .delete(baseUrl + "api/users?page={pageNumber}");
        response.then().log().all()
                .assertThat()
                .statusCode(204);
    }
}
