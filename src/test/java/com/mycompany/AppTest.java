package com.mycompany;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

import org.junit.ClassRule;
import org.junit.Test;

/**
 * @author jooby generator
 */
public class AppTest {

  @Test
  public void integrationTest() throws InterruptedException {

    App app = new App();
    app.start();

    Thread.sleep(3000);

    when().
            get("/foo")
    .then()
        .assertThat()
        .statusCode(200)
        .body(equalTo("I am in the src/main/resources folder"));
  }


}
