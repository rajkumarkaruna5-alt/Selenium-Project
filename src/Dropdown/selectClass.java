package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectClass {

    public static void select() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        Thread.sleep(1000);

        driver.get("https://practice.expandtesting.com/dropdown#google_vignette");
        Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        //Select by Index
        WebElement simpledropdown = driver.findElement(By.xpath("//select[@id='dropdown']"));
        Select select = new Select(simpledropdown);

        js.executeScript("arguments[0].click()", simpledropdown);
        Thread.sleep(2000);
        select.selectByIndex(2);
        Thread.sleep(2000);


        //Select by Value
        WebElement DOB = driver.findElement(By.xpath("//select[@id='elementsPerPageSelect']"));
        Select select1 = new Select(DOB);

        js.executeScript("arguments[0].click()", DOB);
        select1.selectByValue("100");
        Thread.sleep(2000);

        //Select by visible text and contains
        WebElement country = driver.findElement(By.xpath("//select[@id='country']"));
        Select select2 = new Select(country);

        js.executeScript("arguments[0].click()", country);
        Thread.sleep(1000);
        select2.selectByVisibleText("Kazakhstan");
        Thread.sleep(1000);
        select2.selectByContainsVisibleText("Saudi");
        Thread.sleep(5000);

        driver.quit();


    }


    static void main(String[] args) throws InterruptedException {

        select();
    }

}
