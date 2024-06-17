import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {


  @Test
  public void registerPositiveTest() {

    click(By.cssSelector("[href='/register']"));
    click(By.cssSelector("#gender-male"));
    type(By.cssSelector("#FirstName"), "Hans");
    type(By.cssSelector("#LastName"), "Mustermann");
    type(By.cssSelector("#Email"), "testor@test.info");
    type(By.cssSelector("#Password"), "Abc1234!");
    type(By.cssSelector("#ConfirmPassword"), "Abc1234!");
    click(By.name("register-button"));

    //assert Sign Out button is present
    Assert.assertTrue(isElementPresent(By.cssSelector(".ico-logout")));  }

  @Test
  public void loginPositiveTest() {


    click(By.cssSelector("[href='/login']"));
    type(By.name("Email"), "testor@test.info");
    type(By.name("Password"), "Abc1234!");
    click(By.cssSelector(".login-button"));

    //assert Sign Out button is present
    Assert.assertTrue(isElementPresent(By.cssSelector(".ico-logout")));


  }
}
