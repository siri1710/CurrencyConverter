package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import support.Browser;
import support.Action;
import java.util.concurrent.TimeUnit;

/**
 * Class to represent the currency converter
 */

public class CurrencyConverterTest {

    //UI Map
    public By COOKIE = By.cssSelector("button.privacy-basic-button");
    public By AMOUNT = By.id("amount");
    public By SELECTING_FROM_CURRENCY = By.cssSelector("div.converterform-dropdown");
    public By SELECTING_TO_CURRENCY = By.cssSelector("div.converterform-field-wrap:nth-child(4) > div:nth-child(2)");
    public By SUBMIT = By.cssSelector("button.submitButton");
    public By RATE = By.cssSelector("span.converterresult-toAmount");
    public By FROM_CURRENCY_DISPLAY = By.xpath("//*[@id=\"converterResult\"]/div/div/div[1]/span[3]");
    public By TO_CURRENCY_DISPLAYED = By.cssSelector("span.converterresult-toCurrency");

    WebDriver driver;
    //Constructor
    public CurrencyConverterTest(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // To go to the currency converter url
    public void goToURL() {
        driver = Browser.launch();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get("https://www.xe.com/currencyconverter/");
        driver.findElement(COOKIE).click();
    }

    //Enter the amount
    public void enterAmount(String Amount) {
        WebElement amt = driver.findElement(AMOUNT);
        amt.sendKeys(Amount);
    }

    //Enter from currency
    public void fromCurrency(String FromValue) {
        WebElement FromCurrency = driver.findElement(SELECTING_FROM_CURRENCY);
        FromCurrency.click();
        Action myAction = new Action(driver);
        myAction.selectCurrencyFromDropdown(FromCurrency, FromValue);

    }

    //Enter to currency
    public void toCurrency(String ToValue) {
        WebElement FromCurrency = driver.findElement(SELECTING_TO_CURRENCY);
        FromCurrency.click();
        Action myAction = new Action(driver);
        myAction.selectCurrencyFromDropdown(FromCurrency, ToValue);
    }

    // Clicking on submit button
    public void clickOnSubmit() {
        WebElement Submit = driver.findElement(SUBMIT);
        Submit.click();
    }

    //Asserting the rate is displayed
    public void assertConversionRate() {
        WebElement Rate = driver.findElement(RATE);
        String rate = Rate.getText();
        System.out.println(rate);
        Assert.assertEquals(true, Rate.isDisplayed());
    }

    //Asserting the from currency displayed equals the selected
    public void assertCurrencyFrom(String FromValue) {
        WebElement FromCurrency = driver.findElement(FROM_CURRENCY_DISPLAY);
        String FromCurrencyText = FromCurrency.getText();
        System.out.println(FromCurrencyText + "\n");
        Assert.assertEquals(FromValue, FromCurrencyText);
    }

    //Asserting the to currency displayed equals selected
    public void assertCurrencyTo(String ToValue) {
        WebElement ToCurrency = driver.findElement(TO_CURRENCY_DISPLAYED);
        String ToCurrencyText = ToCurrency.getText();
        System.out.println(ToCurrencyText);
        Assert.assertEquals(ToValue, ToCurrencyText);
        driver.close();
    }
}



