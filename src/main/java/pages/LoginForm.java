package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class LoginForm extends Base {

    public LoginForm(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH,
            using = "//a[text()=\"Mail.ru\"]")
    public WebElement formTitle;

    public void checkElementPage(String el) {
        checkElementContains(formTitle, el);
    }

    @FindAll(@FindBy(how = How.XPATH,
            using = "//input[@placeholder]"))
    public List<WebElement> validLoginPassword;

    public void enterValidLoginPassword(String el, String value) {
        enterDataLoginForm(validLoginPassword, el, value);
    }

    @FindBy(how = How.XPATH,
            using = "//input[@class=\"o-control\"]")
    public WebElement buttonToComeIn;

    public void pushButtonToComeIn() {
        pushButton(buttonToComeIn);
    }


}
