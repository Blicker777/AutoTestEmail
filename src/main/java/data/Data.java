package data;

import org.testng.annotations.DataProvider;

public class Data {

    @DataProvider(name = "checkPageName")
    public Object[][] checkPageName() {
        return new Object[][] {
                {Options.titleName}
        };
    }

    @DataProvider(name = "enterValidLoginPassword")
    public Object[][] enterValidLoginPassword() {
        return new Object[][] {
                {Options.loginFormName, Options.validLogin},
                {Options.passwordFormName, Options.validPassword}
        };
    }

    @DataProvider(name = "checkPageNameEmail")
    public Object[][] checkPageNameEmail() {
        return new Object[][] {
                {Options.pageNameEmailAttribute, Options.pageNameEmail}
        };
    }


}
