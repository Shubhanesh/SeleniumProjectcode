package PracticeProject;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class Dropdown1 {
    /*
    Launch the browser.
    Open "https://demoqa.com/select-menu".
    Select the Standard Multi-Select using the element id.
    Verifying that the element is multi-select.
    Select 'Opel' using the index and deselect the same using index.
    Select 'Saab' using value and deselect the same using value.
    Deselect all the options.
    Close the browser.
    */
    @Test(groups = "QA")
    @Description("MultiDropdown scenario")
    public void testPositive() throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://demoqa.com/select-menu");
        driver.manage().window().maximize();

        Select select= new Select(driver.findElement(By.id("cars")));
        System.out.println("The dropdown lists are:");
        List<WebElement> options= select.getOptions();
        for(WebElement option: options)
        System.out.println(option.getText());

        if(select.isMultiple()){
            System.out.println("Select option Opel by Index");
            select.selectByIndex(2);

            System.out.println("Select option saab by Value");
            select.selectByValue("saab");

            System.out.println("Select option Audi by Text");
            select.selectByVisibleText("Audi");

            System.out.println("The selected values in the dropdown options are -");

            List<WebElement> selectedOptions = select.getAllSelectedOptions();
            for(WebElement soption: selectedOptions)
                System.out.println(soption.getText());

            System.out.println("DeSelect option Audi by Index");
            select.deselectByIndex(3);

            System.out.println("Select option Opel by Text");
            select.deselectByVisibleText("Opel");

            System.out.println("The selected values after deselect in the dropdown options are -");
            List<WebElement> selectedOptionsAfterDeselect = select.getAllSelectedOptions();
            for(WebElement selectedOptionAfterDeselect: selectedOptionsAfterDeselect)
                System.out.println(selectedOptionAfterDeselect.getText());
            select.deselectAll();


        }
        driver.quit();

    }




}
