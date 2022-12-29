package Pages;
import Util.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class TrendyolPages {
    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;

    static By iconClose = By.id("Rating-Review");
    static By search = By.xpath("//input[@placeholder='Aradığınız ürün, kategori veya markayı yazınız']");
    static By searchIcon = By.xpath("//i[@class='ft51BU2r']");

    static  By acceptCookie = By.id("onetrust-accept-btn-handler");
    static By filterLenovo= By.xpath("//div[@data-fragment-name='MarketingSearch']//div[3]//div[1]//div[1]//div[1]//div[1]//a[1]//div[1]");

    static By higherPrice = By.xpath("//body/div[@id='container']/div[@data-fragment-name='MarketingSearch']/div[@data-partial-fragment-name='MarketingSearch']/div/div[@data-fragment-name='Search']/div[@id='search-app']/div[@class='search-app-container']/div[@class='srch-rslt-cntnt']/div[@class='srch-aggrgtn-cntnr']/div[@id='sticky-aggregations']/div[@class='aggrgtn-cntnr-wrppr']/div[1]/div[1]");
    static By higherSelector = By.cssSelector("body > div:nth-child(1) > div:nth-child(5) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(9) > div:nth-child(1)");

    static By firstProduct = By.cssSelector("span[title=\"Legion 7 Intel Core i7 11800H 32GB 1TB SSD 8GB RTX3070 DOS 16'' WQXGA 165Hz Gaming Laptop 82K6001RTX\"]");

    static By returnHomePage = By.id("logo");

    static By sliderApple = By.xpath("//a[10]//img[1]");

    static By clickFirstProduct = By.xpath("//body/div[@id='container']/div[@data-fragment-name='MarketingSearch']/div[@data-partial-fragment-name='MarketingSearch']/div/div[@data-fragment-name='Search']/div[@id='search-app']/div[@class='search-app-container']/div[@class='srch-rslt-cntnt']/div[@class='srch-prdcts-cntnr']/div/div/div[@class='prdct-cntnr-wrppr']/div[1]/div[1]/a[1]/div[1]/div[2]/div[2]");

    static By clickBasket = By.xpath("//p[normalize-space()='Sepetim']");
    public TrendyolPages(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.elementHelper = new ElementHelper(driver);
    }


    public static void HomePage() {


    }

    public static void acceptCookie() {
        elementHelper.click(iconClose);
        elementHelper.click(acceptCookie);
    }
    public static void clickTheSearchButton() {
        elementHelper.click(search);
    }

    public static void writeProductName() {
        elementHelper.findElement(search).sendKeys("Laptop");
    }

    public static void clickSearchButton() {
        elementHelper.click(searchIcon);
    }

    public static void filterForBrandByLenovo() {
        elementHelper.click(filterLenovo);
    }

    public static void filterForHighestPrice() {
        elementHelper.click(higherPrice);
        elementHelper.click(higherSelector);
    }



    public static void returnTheHomePage() {
        elementHelper.click(returnHomePage);
    }

    public static void selectAppleForTheSlider() {
        elementHelper.click(sliderApple);
    }

    public static void clickTheFirstProduct() {
        elementHelper.click(clickFirstProduct);
    }



    public static void checkBasket() {
        elementHelper.click(clickBasket);
    }


}
