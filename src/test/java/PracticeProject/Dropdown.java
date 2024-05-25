package PracticeProject;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class Dropdown {
    /*
    Launch the browser.
    Open "https://demoqa.com/select-menu".
    Select the Old Style Select Menu using the element id.
    Print all the options of the dropdown.
    Select 'Purple' using the index.
    After that, select 'Magenta' using visible text.
    Select an option using value.
    Close the browser
    */
    @Test(groups = "QA")
    @Description("Launch the URL and handled the dropdown")

    public void launchedURL(){
        WebDriver driver= new ChromeDriver();
        driver.get("https://demoqa.com/select-menu");

        driver.manage().window().maximize();
     WebElement  element_select = driver.findElement(By.id("oldSelectMenu"));

        Select select = new Select(element_select);
        //select.selectByIndex(1);

        List<WebElement> lst = select.getOptions();
        for(WebElement options: lst)
            System.out.println(options.getText());

        select.selectByIndex(4);
        System.out.println("Select value is: " + select.getFirstSelectedOption().getText());

        select.selectByVisibleText("Magenta");
        System.out.println("Select value is: " + select.getFirstSelectedOption().getText());

        driver.quit();



    }


}
