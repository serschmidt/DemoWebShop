import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {


  @Test
  public void loginPositiveTest() {


    click(By.cssSelector("[href='/login']"));
    type(By.name("Email"), "testor@test.info"); //  By.id(email)
    type(By.name("Password"), "Abc1234!");
    click(By.cssSelector(".login-button"));

    //assert Sign Out button is present
    Assert.assertTrue(isElementPresent(By.cssSelector(".ico-logout")));


  }
}
