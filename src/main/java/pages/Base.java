package pages;

import helper.InitialSteps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.testng.Assert.assertTrue;

public class Base {

    WebDriver driver = InitialSteps.getDriver();

    public Base(WebDriver driver) {

        PageFactory.initElements(driver, this);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
    }

    public void checkElementContains(WebElement element, String el) {
        assertTrue(element.getText().contains(el));
    }

    public void enterDataLoginForm(List<WebElement> elements, String el, String value) {
        for (WebElement item: elements) {
            if (item.getAttribute("placeholder").equals(el)) {
                item.click();
                item.sendKeys(value);
            }
        }
    }


    public void pushButton(WebElement element) {

        isElementPresent(element, 20);
        element.click();
    }


    public boolean isElementPresent(WebElement elementName, int timeout) {
        try{
            WebDriverWait wait = new WebDriverWait(driver, timeout);
            wait.until(ExpectedConditions.visibilityOf(elementName));
            return true;
        }catch (Exception e) {
            return false;
        }
    }
}
