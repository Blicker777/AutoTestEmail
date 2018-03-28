package stepDefinition;

import data.Data;
import helper.InitialSteps;
import org.testng.annotations.Test;


public class AuthenticationValidDataTestCase extends InitialSteps {

    @Test(dataProvider = "checkPageName",
            dataProviderClass = Data.class)
    public void checkPageName(String element) throws Throwable {
        loginForm.checkElementPage(element);
    }

    @Test(dependsOnMethods = "checkPageName",
            dataProvider = "enterValidLoginPassword",
            dataProviderClass = Data.class)
    public void enterValidLoginPassword(String el, String value) throws Throwable {
        loginForm.enterValidLoginPassword(el, value);
    }

    @Test(dependsOnMethods = "enterValidLoginPassword")
    public void pushButtonToComeIn() throws Throwable {
        loginForm.pushButtonToComeIn();
    }

    @Test(dependsOnMethods = "pushButtonToComeIn")
    public void checkPageNameEmail() throws Throwable {
        basePageEmail.checkElementPage();
    }

    @Test(dependsOnMethods = "checkPageNameEmail")
    public void pushButtonExit() throws Throwable {
        basePageEmail.pushButtonExit();
    }



}
