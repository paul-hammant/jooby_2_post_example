package com.mycompany;

import io.jooby.Jooby;

/**
 * @author jooby generator
 */
public class App extends Jooby {

  {
      assets("/foo", "hi");
  }

  public static void main(final String[] args) {
    runApp(args, App::new);
  }

}
