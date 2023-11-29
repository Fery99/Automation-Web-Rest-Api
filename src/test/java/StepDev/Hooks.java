package StepDev;
import helper.Utility;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import java.util.Objects;

import static java.lang.Thread.sleep;

public class Hooks extends Utility {

  String tagsRunning = null;

  @Before
  public void beforeTest(Scenario scenario) {
    System.out.println("Before Test");

    String[] tags = scenario.getSourceTagNames().toArray(new String[0]);
    if (tags.length > 0) {
      tagsRunning = tags[0];
      if (Objects.equals(tagsRunning, "@web")) {
        getDriver();
      }
    }
  }

  @After
  public void afterTest() throws InterruptedException {
    System.out.println("After Test");
//
//    if (Objects.equals(tagsRunning, "@web")) {
//      quitDriver();
//    }
  }

}