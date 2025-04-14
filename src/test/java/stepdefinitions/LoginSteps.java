package test.java.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class LoginSteps {
    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void setup() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Given("I navigate to the login page")
    public void iNavigateToTheLoginPage() {
        driver.get("https://login-page-lilac-five.vercel.app/");
    }

    @When("I enter username {string}")
    public void iEnterUsername(String username) {
        WebElement usernameField = driver.findElement(By.id("username"));
        usernameField.sendKeys(username);
    }

    @And("I enter password {string}")
    public void iEnterPassword(String password) {
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys(password);
    }

    @And("I click on login button")
    public void iClickOnLoginButton() {
        WebElement loginButton = driver.findElement(By.id("loginButton"));
        loginButton.click();
    }

    @Then("I should see success message")
    public void iShouldSeeSuccessMessage() {
        WebElement successMessage = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("successMessage"))
        );
        assertTrue("Đăng nhập thất bại! Không thấy thông báo thành công.", successMessage.isDisplayed());
        System.out.println("Đăng nhập thành công! Thông báo: " + successMessage.getText());
    }

    @After
    public void tearDown() {
    }
}