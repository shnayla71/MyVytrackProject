package Pages;

import TestUtility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(id="prependedInput")
    public WebElement username1;

    @FindBy(id="prependedInput2")
    public WebElement password1;

    @FindBy(id="_submit")
    public WebElement logInbutton;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[1]/a/span")
    public WebElement fleetAction;

    @FindBy(xpath = "//span[text()='Vehicle Odometer']")
    public WebElement VehicleOdo;

    public  void LogIn(String username,String password){
        username1.sendKeys(username);
        password1.sendKeys(password);
        logInbutton.click();
    }
    public void createNewCar() throws InterruptedException{
        Actions actions = new Actions(Driver.getDriver());
        Thread.sleep(2000);
        actions.moveToElement(fleetAction).perform();

        Thread.sleep(2000);
        VehicleOdo.click();

        Thread.sleep(3000);
        WebElement CreateOdometer =Driver.getDriver().findElement(By.xpath("//div[@class='pull-right title-buttons-container']/a"));

        CreateOdometer.click();

    }
}
