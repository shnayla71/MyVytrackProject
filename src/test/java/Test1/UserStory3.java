package Test1;

import Pages.LoginPage;
import TestUtility.ConfigurationReader;
import TestUtility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UserStory3 {
    @BeforeMethod
    public void LoginFleetVehiclesOdometer() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("vytrack_url"));
        LoginPage lg = new LoginPage();
        lg.LogIn("user7", "UserUser123");

        Thread.sleep(10000);
        Actions actions = new Actions(Driver.getDriver());
        Thread.sleep(2000);
        actions.moveToElement(lg.fleetAction).perform();

    Thread.sleep(2000);
    lg.VehicleOdo.click();


     //  Thread.sleep(4000);
      //  WebElement odometerTable = Driver.getDriver().findElement(By.xpath("//div[@class='other-scroll-container']"));

     //  Assert.assertTrue(odometerTable.isDisplayed());

    }

@Test
public void createOdometerOrCancel() throws InterruptedException {

    Thread.sleep(3000);
    WebElement CreateOdometer =Driver.getDriver().findElement(By.xpath("//div[@class='pull-right title-buttons-container']/a"));

    Assert.assertTrue(CreateOdometer.isDisplayed());

    Thread.sleep(2000);
    CreateOdometer.click();

    Thread.sleep(2000);
    WebElement OdometerValue = Driver.getDriver().findElement(By.name("custom_entity_type[OdometerValue]"));
    OdometerValue.click();
    OdometerValue.sendKeys("145430");


     Thread.sleep(2000);
    WebElement DriverName = Driver.getDriver().findElement(By.name("custom_entity_type[Driver]"));
    DriverName.click();
    DriverName.sendKeys("Mahmut Abbas");


    Thread.sleep(2000);
    WebElement CancelBtn = Driver.getDriver().findElement(By.cssSelector(".btn.back.icons-holder-text "));

    Assert.assertTrue(CancelBtn.isDisplayed());
    Thread.sleep(2000);
    CancelBtn.click();
}

@Test

public void DeleteOrEdit() throws InterruptedException {

    WebElement ClickTable = Driver.getDriver().findElement(By.xpath("//div[@class='grid-scrollable-container']/div/table/tbody/tr[1]"));

    ClickTable.click();

    Thread.sleep(2000);
    WebElement EditBtn = Driver.getDriver().findElement(By.cssSelector(".btn.back.icons-holder-text.edit-button.main-group"));

    Assert.assertTrue(EditBtn.isDisplayed());

    Thread.sleep(2000);
    WebElement DeleteBtn = Driver.getDriver().findElement(By.cssSelector(".btn.icons-holder-text.no-hash.remove-button"));
    Assert.assertTrue(DeleteBtn.isDisplayed());


}

    @Test
    public void ResetGrid() throws InterruptedException{

        WebElement ResetBtn = Driver.getDriver().findElement(By.cssSelector(".action.btn.reset-action.mode-text-only"));
        Thread.sleep(2000);
        ResetBtn.click();

        Assert.assertTrue(ResetBtn.isDisplayed());
    }


    }

