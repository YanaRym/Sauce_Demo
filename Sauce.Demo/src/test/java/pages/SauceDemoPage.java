package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import static constants.PageUrls.SAUCE_DEMO_PAGE;

public class SauceDemoPage extends BasePage {

    private final By USERNAME_FIELD = By.cssSelector("[placeholder='Username']");
    private final By PASSWORD_FIELD = By.cssSelector("[placeholder='Password']");
    private final By LOGIN_BUTTON = By.name("login-button");
    private final By LINKEDIN = By.linkText("LinkedIn");
    private final By LINKEDIN_LOGO = By.xpath("//icon[@data-test-id='nav-logo']");

    public SauceDemoPage(WebDriver driver) {
        super(driver);
    }

    public void openSauceDemo() {
        driver.get(SAUCE_DEMO_PAGE);
    }


    public void inputUsername(String login) {
        WebElement usernameField = driver.findElement(USERNAME_FIELD);
        usernameField.sendKeys(login);
    }

    public void inputPassword(String password) {
        WebElement passwordField = driver.findElement(PASSWORD_FIELD);
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        WebElement loginButton = driver.findElement(LOGIN_BUTTON);
        loginButton.click();
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
    }

    public void goToLinkedIn() {
        WebElement linkedIn = driver.findElement(LINKEDIN);
        linkedIn.click();
    }

    public void switchToLinkedInAndWaitForLogo() {
        Set<String> windows = driver.getWindowHandles();
        driver.switchTo().window(windows.stream().collect(Collectors.toList()).get(1));
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//icon[@data-test-id='nav-logo']")));
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public boolean logoIsDisplayed() {
        WebElement logo = driver.findElement(LINKEDIN_LOGO);
        return logo.isDisplayed();
    }
}
