package com.mycompany;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.junit.ClassRule;
import org.junit.Test;

/**
 * @author jooby generator
 */
public class AppTest {

  @Test
  public void integrationTest() throws InterruptedException {

    new App();

    Thread.sleep(10000);

    given().
            param("one", "1").
    when().
            post("/foo")
    .then()
        .assertThat()
        .body(equalTo("Hi 1"));
  }


}
