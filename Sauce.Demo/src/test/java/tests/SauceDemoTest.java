package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SauceDemoPage;

public class SauceDemoTest extends BaseTest {

    @Test
    public void testSauceDemo() {
        SauceDemoPage sauceDemoPage = new SauceDemoPage(driver);
        sauceDemoPage.openSauceDemo();
        sauceDemoPage.inputUsername(System.getProperty("login"));
        sauceDemoPage.inputPassword(System.getProperty("password"));
        sauceDemoPage.clickLoginButton();
        sauceDemoPage.goToLinkedIn();
        sauceDemoPage.switchToLinkedInAndWaitForLogo();
        Assert.assertTrue(sauceDemoPage.logoIsDisplayed());
    }
}
