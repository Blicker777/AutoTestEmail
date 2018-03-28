package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BasePageEmail extends Base{

    public BasePageEmail(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH,
            using = "//img[@class=\"pm-logo__link__pic\"]")
    public WebElement formTitle;

    public void checkElementPage() {
        isElementPresent(formTitle, 30);
    }

    @FindBy(how = How.XPATH,
            using = "//a[text()=\"выход\"]")
    public WebElement buttonExit;

    public void pushButtonExit() {
        pushButton(buttonExit);
    }

}
