package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Districtapp {


    public static void ticketbooking() throws InterruptedException {

        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.get("https://www.district.in/");
        Thread.sleep(2000);

        driver.findElement(By.linkText("Movies")).click();
        Thread.sleep(2000);

        WebElement spiderman = driver.findElement(By.xpath("//h5[@style='line-height: 22px;']"));
        //driver.findElement(By.linkText("Spider-Man: Brand New Day")).click();
        //span[text()='Only in Theatres']/../../../..//div//a//img[contains(@alt,'Spider-Man')]

        Thread.sleep(2000);
        spiderman.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='MDPv2ContentPage-module-scss-module__ymYSrq__ctaBtn']")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//label[@for='Tamil_lsd']")).click();
        driver.findElement(By.xpath("//span[@data-testid='label']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[@aria-label='Saturday1']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@aria-label='3D filter, click to apply']")).click();
        Thread.sleep(2000);

        driver.findElement(By.linkText("INOX The Marina Mall OMR, Egatoor, Chennai")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@aria-label='View all movies playing here']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[@aria-label='Tamil filter, click to apply']")).click();
        Thread.sleep(2000);

        WebElement timing = driver.findElement(By.xpath("(//div[@class=\"greenCol MovieSessionsListing-module-scss-module__4rcn9q__time\"])[1]"));
        timing.click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@aria-label=\"Continue booking\"]")).click();

        driver.findElement(By.id("available-seat")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@aria-label=\"Proceed\"]")).click();
        Thread.sleep(2000);

        driver.findElement(By.name("mobileNumber")).sendKeys("9677849547");
        Thread.sleep(5000);

        driver.close();

    }


    public static void main(String[] args) throws InterruptedException {

        ticketbooking();


    }



}
