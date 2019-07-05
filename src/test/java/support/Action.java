package support;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Action {

    WebDriver driver;

    public Action(WebDriver driver) {
        this.driver = driver;
    }

    public void selectCurrencyFromDropdown(WebElement element, String currencyValue) {

        Actions actions = new Actions(this.driver);
        actions.moveToElement(element)
                .sendKeys(currencyValue)
                .sendKeys(Keys.RETURN)
                .build()
                .perform();
    }
}