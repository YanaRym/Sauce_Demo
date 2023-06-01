import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class SauceDemoWebElements {
    WebDriver driver;

    WebElement item4TitleLink = driver.findElement(By.id("item_4_title_link"));
    WebElement loginButton = driver.findElement(By.name("Login-button"));
    WebElement allItemsMenu = driver.findElement(By.className("bm-item menu-item"));
    WebElement containers = driver.findElement(By.tagName("span"));
    WebElement instagramButton = driver.findElement(By.linkText("LinkedIn"));
    WebElement twitterButton = driver.findElement(By.partialLinkText("book"));
    WebElement shoppingCart = driver.findElement(By.xpath("//div[@class='shopping_cart_container']"));
    WebElement cancelShoppingCartButton = driver.findElement(By.xpath("//button[text()='Cancel']"));
    WebElement containerError = driver.findElement(By.xpath("//div[contains(@class, 'error-message')]"));
    WebElement errorMessage = driver.findElement(By.xpath("//h3[contains(text(), 'sadface')]"));
    WebElement inventoryItemPrice = driver.findElement(By.xpath("//div[@class='inventory_item_price']/ancestor::button"));
    WebElement pricebar = driver.findElement(By.xpath("//div[@id='inventory_container']/descendant::div[@class='pricebar']"));
    WebElement inputFields = driver.findElement(By.xpath("//form/following::input"));
    WebElement itemPrice = driver.findElement(By.xpath("//div[@class='inventory_item_price']/parent::div"));
    WebElement login = driver.findElement(By.xpath("//h4/preceding::div[contains(@class, 'login')]"));
    WebElement sauceLabsBackpackPrice = driver.findElement(By.xpath("//div[@class='inventory_item_price' and contains(text(), '29.99')]"));
    WebElement itemLabel = driver.findElement(By.cssSelector(".inventory_item_label"));
    WebElement itemNameLargeSize = driver.findElement(By.cssSelector(".inventory_details_name.large_size"));
    WebElement social = driver.findElement(By.cssSelector(".footer .social"));
    WebElement content = driver.findElement(By.cssSelector("#contents_wrapper"));
    WebElement title = driver.findElement(By.cssSelector("title"));
    WebElement shoppingCartLink = driver.findElement(By.cssSelector("a.shopping_cart_link"));
    WebElement pageWrapper = driver.findElement(By.cssSelector("[id=page_wrapper]"));
    WebElement item_search = driver.findElement(By.cssSelector("[[class~='item']]"));
    WebElement loginContainer = driver.findElement(By.cssSelector("[class|='login']"));
    WebElement header = driver.findElement(By.cssSelector("[class^='header']"));
    WebElement itemImage = driver.findElement(By.cssSelector("[href$='_img']"));
    WebElement itemDescription = driver.findElement(By.cssSelector("[class*='item_desc']"));
    WebElement socialTwitter = driver.findElement(By.cssSelector("[li:first-child]"));
    WebElement socialFacebook = driver.findElement(By.cssSelector("[li:nth-child(2)]"));

}

