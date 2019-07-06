package com.mycompany;

import org.jooby.Jooby;

/**
 * @author jooby generator
 */
public class App extends Jooby {

  {
    post("/foo", (req) -> "Hi " + req.param("one").value());
  }

  public static void main(final String[] args) {
    run(App::new, args);
  }

}
