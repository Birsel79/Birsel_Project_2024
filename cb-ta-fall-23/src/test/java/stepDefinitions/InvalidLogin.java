package stepDefinitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InvalidLogin extends BaseTest {

    @And("User enters invalid password")
    public void invalidPasswordEntry() {
        WebElement passwordInput = driver.findElement(By.xpath("//input[@id='password']"));
        passwordInput.sendKeys("secret_sauce123");
    }
}
