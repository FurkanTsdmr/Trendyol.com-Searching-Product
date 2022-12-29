package StepDefinitions;
import Pages.TrendyolPages;
import Util.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class TrendyolSteps {
    WebDriver driver = DriverFactory.getDriver();
    TrendyolPages trendyolPages = new TrendyolPages(driver);



    @Given("User is on homepage")
    public void userIsOnHomepage() {

    }
    @When("Click accept cookies")
    public void clickAcceptCookies() {

        TrendyolPages.acceptCookie();
    }
    @When("Click the search button")
    public void clickTheSearchButton() {
        TrendyolPages.clickTheSearchButton();
    }

    @When("Write product name")
    public void writeProductName() {
        TrendyolPages.writeProductName();
    }

    @When("Click search button")
    public void clickSearchButton() {
        TrendyolPages.clickSearchButton();
    }

    @When("Filter for brand by LENOVO")
    public void filterForBrandByLENOVO() {
        TrendyolPages.filterForBrandByLenovo();
    }

    @When("Filter for highest price")
    public void filterForHighestPrice() {
        TrendyolPages.filterForHighestPrice();
    }



    @When("Return the homepage")
    public void returnTheHomepage() {
        TrendyolPages.returnTheHomePage();
    }


    @When("Select apple for the slider")
    public void selectAppleForTheSlider() {
        TrendyolPages.selectAppleForTheSlider();
    }

    @When("Click the first product")
    public void clickTheFirstproduct() {
        TrendyolPages.clickTheFirstProduct();
    }





}
