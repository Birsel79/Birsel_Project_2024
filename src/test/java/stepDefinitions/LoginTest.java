package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginTest extends BaseTest {


    @Given("User is on login page")
    public void user_is_on_login_page() {

        driver.get("https://www.saucedemo.com/");
    }

    @When("User enters valid username")
    public void user_enters_valid_username() {
        WebElement userNameInput = driver.findElement(By.xpath("//input[@id='user-name']"));
        userNameInput.sendKeys("standard_user");
    }
//Parametre
    // @When("User enters {word}")
    // public void user_enters_valid_username(String loginName){
    //System.out.println(loginName);
//}
//    @When("User enters:")
//    public void user_enters_valid_username(List<String> loginName){
//        System.out.println(loginName);
//            }

    @And("User enters valid password")
    public void user_enters_valid_password() {
        WebElement passwordInput = driver.findElement(By.xpath("//input[@id='password']"));
        passwordInput.sendKeys("secret_sauce");
    }

    @And("User clicks login button")
    public void user_clicks_login_button() {
        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='login-button']"));
        loginBtn.click();
    }

    @Then("User should successfully login the system")
    public void user_should_successfully_login_the_system() {
        System.out.println("Test done");
    }
}

 /*   @When("User enters valid <{string}>")
  public void user_enters_valid_username(String s){
        //System.out.println(s);
*/