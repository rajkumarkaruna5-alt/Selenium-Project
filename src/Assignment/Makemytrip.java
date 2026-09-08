package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Makemytrip {


    public static void ticketbooking() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        Thread.sleep(1000);

        driver.get("https://www.makemytrip.com/");
        Thread.sleep(3000);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement buses = driver.findElement(By.xpath("//span[text()='Buses']"));
        buses.click();
        Thread.sleep(3000);

        WebElement frontpagepopup = driver.findElement(By.xpath("//span[@class='commonModal__close']"));
        //wait.until(ExpectedConditions.elementToBeClickable(frontpagepopup));
        frontpagepopup.click();
        Thread.sleep(2000);

        WebElement from = driver.findElement(By.xpath("//input[@id='fromCity']"));
        from.click();
        Thread.sleep(1000);

        WebElement fromsearchbar = driver.findElement(By.xpath("//input[@placeholder='From']"));
        fromsearchbar.click();
        Thread.sleep(1000);
        fromsearchbar.sendKeys("Chennai");
        Thread.sleep(1000);

        WebElement chennai = driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']"));
        chennai.click();
        Thread.sleep(2000);

        /*WebElement to = driver.findElement(By.xpath("//input[@id='toCity']"));
        to.click();
        Thread.sleep(1000);*/

        WebElement tosearchbar = driver.findElement(By.xpath("//input[@placeholder='To']"));
        tosearchbar.click();
        Thread.sleep(1000);
        tosearchbar.sendKeys("Bengaluru");
        Thread.sleep(1000);

        WebElement bengaluru = driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']"));
        bengaluru.click();
        Thread.sleep(1000);

        WebElement date = driver.findElement(By.xpath("(//div[@aria-disabled='false'])[5]"));
        Thread.sleep(2000);
        date.click();

        WebElement search = driver.findElement(By.xpath("//button[@id='search_button']"));
        search.click();
        Thread.sleep(3000);


    }

    public static void main(String[] args) throws InterruptedException {

        ticketbooking();

    }






}
