import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {


  @Test
  public void loginPositiveTest() {


    clickOnLogin();
    fillLoginForm();
    clickOnLoginButton();

    //assert Sign Out button is present
    Assert.assertTrue(isElementPresent(By.cssSelector(".ico-logout")));


  }

  public void fillLoginForm() {
    type(By.name("Email"), "testor@test.info"); //  By.id(email)
    type(By.name("Password"), "Abc1234!");
  }

  public void clickOnLogin() {
    String cssSelector = "[href='/login']";
    click(By.cssSelector(cssSelector));
  }

  public void clickOnLoginButton() {
    String cssSelector = ".login-button";
    click(By.cssSelector(cssSelector));
  }
}
