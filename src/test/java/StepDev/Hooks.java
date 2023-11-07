package StepDev;
import helper.Utility;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import static java.lang.Thread.sleep;

public class Hooks extends Utility {

  @Before
  public void beforeTest() {
    getDriver();
  }

  @After
  public void afterTest()throws InterruptedException {
//    Thread.sleep(1000);
    driver.close();
  }
}
