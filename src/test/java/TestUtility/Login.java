package TestUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
    public static void login(WebDriver driver) {
        //3.Username "Tester"
        WebElement userName = driver.findElement(By.xpath("//input[@id='prependedInput']"));
        userName.sendKeys("salesmanager122");
        // 4.Enter password: “test”
        WebElement passWord = driver.findElement(By.xpath("//input[@id='prependedInput2']"));
        passWord.sendKeys("UserUser123");
        // 5.Click to Login button
        WebElement login = driver.findElement(By.xpath("//button[@id='_submit']"));
        login.click();
    }
}
