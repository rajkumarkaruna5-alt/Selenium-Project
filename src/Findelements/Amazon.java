package Findelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {


    public static void amazon() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        Thread.sleep(3000);

        WebElement search = driver.findElement(By.xpath("//input[@role='searchbox']"));
        search.sendKeys("laptop");
        Thread.sleep(2000);

        driver.findElement(By.id("nav-search-submit-button")).click();
        Thread.sleep(3000);

        WebElement rating = driver.findElement(By.xpath("//i[@class='a-icon a-icon-popover']"));
        rating.click();
        Thread.sleep(3000);

        driver.findElement(By.id("acrPopoverLink")).click();
        Thread.sleep(4000);

        driver.quit();

    }


    public static void main(String[] args) throws InterruptedException {

        amazon();


    }


}
