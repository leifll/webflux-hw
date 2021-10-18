package se.leiflindback.webfluxhw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Starts the hello world application.
 */
@SpringBootApplication
public class Main {
  /**
   * Starts the hello world application.
   *
   * @param args There are no command line parameters.
   */
  public static void main(String[] args) {
    SpringApplication app = new SpringApplication(Main.class);
    app.run(args);
  }
}
