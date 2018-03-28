package pages;

import helper.InitialSteps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class Base {

    WebDriver driver = InitialSteps.getDriver();

    public Base(WebDriver driver) {

        PageFactory.initElements(driver, this);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
    }
}
