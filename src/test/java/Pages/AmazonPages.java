package Pages;

import Util.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonPages {
    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;


    static By accept = By.id("sp-cc-accept");
    static By search = By.id("twotabsearchtextbox");
    static By serachButton = By.id("nav-search-submit-button");
    static By amazonFilter =By.xpath("//span[@class='a-size-base a-color-base'][contains(text(),'Amazon Tarafından Gönderilir')]");
    static By appleFilter = By.xpath("//span[@class='a-size-base a-color-base'][normalize-space()='Apple']");
    static By firstProduct = By.xpath("//img[@alt='Apple 3,5 mm Kulaklık Jaklı EarPods']");
    static By add = By.cssSelector("#add-to-cart-button");
    static By cart = By.xpath("//a[@href='/gp/cart/view.html?ref_=sw_gtc']");
    static By check = By.cssSelector(".a-truncate-cut");

    public AmazonPages(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }

    public static void HomePage() {
    }

    public static void acceptCookie() {
        elementHelper.click(accept);
    }

    public static void clickSearch() {
        elementHelper.click(search);
    }

    public static void writeProduct() {
        elementHelper.sendKey(search, "airpods");
    }

    public static void searchButton() {
        elementHelper.click(serachButton);
    }

    public static void filterAmazon() {
        elementHelper.click(amazonFilter);
    }

    public static void filterApple() {
        elementHelper.click(appleFilter);
    }

    public static void firstProduct() {
        elementHelper.click(firstProduct);
    }

    public static void addToCart()  {
        elementHelper.click(add);
        elementHelper.click(cart);
    }

    public static void checkCart() {
        elementHelper.checkVisible(check);
    }
}
