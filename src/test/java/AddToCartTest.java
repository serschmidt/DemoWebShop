// login
// add second product to the cart
// check the cart


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddToCartTest extends TestBase {

  @BeforeMethod
  public void precondition() {

    String userLogin = "testor@test.info";
    String userPassword = "Abc1234!";

    click(By.cssSelector(".ico-login"));
    type(By.id("Email"), userLogin); //  By.id(email)
    type(By.id("Password"), userPassword);
    click(By.cssSelector(".login-button"));
  }

  @Test
  public void addItemToCartPositiveTest() {

    System.out.println("test is running");
    click(By.xpath("//div[@data-productid='31']//input[@type='button']"));
    click(By.cssSelector("#topcartlink"));

    Assert.assertTrue(isElementPresent(By.cssSelector("a[href='/141-inch-laptop']")));


  }

  @AfterMethod
  public void postCondition(){
    click(By.name("removefromcart"));
    click(By.name("updatecart"));
  }

}
