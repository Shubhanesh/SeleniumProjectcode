package PracticeProject;

import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleAlert {
EdgeDriver driver;

    @BeforeTest
    public void openBrowser() {
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new EdgeDriver(options);
    }
    @Test(groups= "QA")
    @Description("Test case discription")
    public void testPositive()throws InterruptedException{

        try{
            driver.manage().window().maximize();
            driver.get("https://google.com");
            WebElement ele = driver.findElement(By.xpath("//*[@class=\"gLFyf\"]"));
            driver.navigate().refresh();
            WebElement ele2 = driver.findElement(By.xpath("//*[@class=\"gLFyf\"]"));
            ele2.sendKeys("The Testing Academy");
            //        driver.switchTo().frame(1);
            driver.switchTo().alert().accept();


        }catch (StaleElementReferenceException | NoSuchElementException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }
}