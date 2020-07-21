package Test1;

import Pages.LoginPage;
import TestUtility.ConfigurationReader;
import TestUtility.Driver;
import org.testng.annotations.Test;

public class UserStory4 {
    LoginPage loginPage=new LoginPage();
    @Test
    public void TruckUsername() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("vytrack_url"));
     loginPage.LogIn(ConfigurationReader.getProperty("username"),ConfigurationReader.getProperty("password"));
     loginPage.createNewCar();
    }

    @Test
    public void StoreUserName() throws InterruptedException{
        Driver.getDriver().get(ConfigurationReader.getProperty("vytrack_url"));
        loginPage.LogIn(ConfigurationReader.getProperty("username"),ConfigurationReader.getProperty("password"));
        loginPage.createNewCar();
    }
    @Test
    public void SalesUserName() throws  InterruptedException{
        Driver.getDriver().get(ConfigurationReader.getProperty("vytrack_url"));
        loginPage.LogIn(ConfigurationReader.getProperty("username"),ConfigurationReader.getProperty("password"));
        loginPage.createNewCar();
    }
}
