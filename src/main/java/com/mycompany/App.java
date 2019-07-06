package com.mycompany;

import io.jooby.Jooby;

/**
 * @author jooby generator
 */
public class App extends Jooby {

  {
    post("/foo", (req) -> "Hi " + req.form("one").value());
  }

  public static void main(final String[] args) {
    runApp(args, App::new);
  }

}
