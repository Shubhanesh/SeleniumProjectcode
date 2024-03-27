package org.example.Selenium23032024;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Selenium17 {
    // Atomic Test Cases
    // TC who don't have any dep.
    // They serve single purpose 0

    EdgeDriver driver;
@BeforeTest
    public void openbrowser(){
        driver=new EdgeDriver();
    }
 @Test(groups="QA")
   @Description("Test case discription")

    public void VWOLogin_negative()throws InterruptedException{
    driver.get("https://katalon-demo-cura.herokuapp.com/");
    driver.manage().window().maximize();
 }
 @AfterTest
    public void closedbrowser(){
    driver.quit();
 }
}
