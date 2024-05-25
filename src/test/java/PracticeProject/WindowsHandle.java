package PracticeProject;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowsHandle {
    EdgeDriver driver;

    @BeforeTest
    public void openBrowser() {
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new EdgeDriver(options);
    }

    @Test(groups = "QA")
    @Description("Tes case discription")
    public void testPostive() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/windows");
        driver.manage().window().maximize();
        String mainWindowhandle = driver.getWindowHandle();
        System.out.println("Before Click " + mainWindowhandle);
        WebElement link = driver.findElement(By.linkText("Click Here"));
        link.click();
        Set<String> windowhandles = driver.getWindowHandles();
        //All the Windows Tab have a unique name
        for (String handle : windowhandles) {
            driver.switchTo().window(handle);
            System.out.println(handle);
            if (driver.getPageSource().contains("New Window")) {
                System.out.println("Test case Passed");
            }
        }

        driver.switchTo().window(mainWindowhandle);
        Thread.sleep(2000);
    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}