package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

public class CurrencyConverterSteps {

    WebDriver driver;
    CurrencyConverterTest getCurrencyConverter = new CurrencyConverterTest(driver);

    @Given("^User goes to the currency converter url$")
    public void userGoesToTheCurrencyConverterURL() throws Throwable {
        getCurrencyConverter.goToURL();
    }

    @Given("^Enter the amount for conversion (.*?)$")
    public void enterTheAmountForConversion(String Amount) throws Throwable {
        getCurrencyConverter.enterAmount(Amount);
    }

    @And("^Select the from currency (.*?)$")
    public void selectingTheFromCurrency(String FromValue) throws Throwable {
        getCurrencyConverter.fromCurrency(FromValue);
    }

    @And("^Select the to currency (.*?)$")
    public void selectingTheToCurrency(String ToValue) throws Throwable {
        getCurrencyConverter.toCurrency(ToValue);
    }

    @Then("^Click on submit$")
    public void clickOnSubmit() throws Throwable {
        getCurrencyConverter.clickOnSubmit();
    }

    @And("^Asserting the conversion (.*?) (.*?)$")
    public void assertingTheConversion(String FromValue, String ToValue) throws Throwable {
        getCurrencyConverter.assertConversionRate();
        getCurrencyConverter.assertCurrencyFrom(FromValue);
        getCurrencyConverter.assertCurrencyTo(ToValue);
    }

}

