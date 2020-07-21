package Test1;

import Pages.LoginPage;
import TestUtility.ConfigurationReader;
import TestUtility.Driver;
import org.testng.annotations.Test;

public class UserStory1 {

    @Test
    public void UserStory1Test(){
        Driver.getDriver().get(ConfigurationReader.getProperty("vytrack_url"));
        LoginPage loginPage=new LoginPage();

        loginPage.username1.sendKeys(ConfigurationReader.getProperty("username"));
        loginPage.password1.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.logInbutton.click();
    }
}
