package Dropdown;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class Methodsasparameters {

    //public static WebDriver driver;
    //public static WebDriver driver1;
    //public static WebDriver driver2;


    public static void Google_apps(WebDriver driver, String app) throws InterruptedException, IOException {

        if (app.equalsIgnoreCase("maps")) {

            driver.manage().window().maximize();
            Thread.sleep(2000);

            driver.get("https://www.google.com/");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            Thread.sleep(2000);

            WebElement googleapps = driver.findElement(By.xpath("//a[@aria-label='Google apps']"));
            googleapps.click();
            Thread.sleep(2000);

            WebElement frame = driver.findElement(By.xpath("//iframe[@name='app']"));
            driver.switchTo().frame(frame);
            Thread.sleep(2000);

            WebElement maps = driver.findElement(By.xpath("//span[@data-text='Maps']"));
            maps.click();
            driver.switchTo().defaultContent();
            Thread.sleep(4000);

            WebElement layout = driver.findElement(By.xpath("//button[@class='yHc72 qk5Wte']"));
            layout.click();
            Thread.sleep(2000);

            WebElement directions = driver.findElement(By.xpath("//button[@aria-label='Directions']"));
            directions.click();
            Thread.sleep(2000);

            WebElement startingpoint = driver.findElement(By.xpath("//input[contains(@aria-label,'tarting point')]"));
            startingpoint.sendKeys("Trichy", Keys.ENTER);
            Thread.sleep(2000);

            WebElement endingpoint = driver.findElement(By.xpath("//input[contains(@placeholder,'Choose destination')]"));
            endingpoint.sendKeys("Salem", Keys.ENTER);
            Thread.sleep(2000);
        }



        else if (app.equalsIgnoreCase("youtube")) {


            driver.manage().window().maximize();
            Thread.sleep(2000);

            driver.get("https://www.google.com/");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            Thread.sleep(2000);

            WebElement googleapps = driver.findElement(By.xpath("//a[@aria-label='Google apps']"));
            googleapps.click();
            Thread.sleep(2000);

            WebElement frame = driver.findElement(By.xpath("//iframe[@name='app']"));
            driver.switchTo().frame(frame);
            Thread.sleep(2000);

            WebElement youtube = driver.findElement(By.xpath("//span[@data-text='YouTube']"));
            youtube.click();
            driver.switchTo().defaultContent();
            Thread.sleep(4000);

            WebElement searchbar = driver.findElement(By.xpath("//input[@name='search_query']"));
            searchbar.sendKeys("Pitbull songs", Keys.ENTER);
            Thread.sleep(2000);

            WebElement song = driver.findElement(By.xpath("//a[@title='Pitbull - Rain Over Me ft. Marc Anthony']"));
            song.click();
            Thread.sleep(2000);

            WebElement mute = driver.findElement(By.xpath("//button[@aria-keyshortcuts='m']"));
            mute.click();
            Thread.sleep(2000);
        }


        
        else if (app.equalsIgnoreCase("playstore")) {


            driver.manage().window().maximize();
            Thread.sleep(2000);

            driver.get("https://www.google.com/");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            Thread.sleep(2000);

            WebElement googleapps = driver.findElement(By.xpath("//a[@aria-label='Google apps']"));
            googleapps.click();
            Thread.sleep(2000);

            WebElement frame1 = driver.findElement(By.xpath("//iframe[@name='app']"));
            driver.switchTo().frame(frame1);
            Thread.sleep(2000);

            WebElement playstore = driver.findElement(By.xpath("//span[@data-text='Play']"));
            playstore.click();
            driver.switchTo().defaultContent();
            Thread.sleep(4000);

            WebElement searchicon = driver.findElement(By.xpath("//button[@aria-label='Search']"));
            searchicon.click();
            Thread.sleep(1000);

            WebElement searchbar = driver.findElement(By.xpath("//input[@aria-label='Search Google Play']"));
            searchbar.sendKeys("Temple run", Keys.ENTER);
            Thread.sleep(2000);

            WebElement install = driver.findElement(By.xpath("//button[@aria-label='Install']"));
            install.click();
            Thread.sleep(2000);
        }


    }




    public static void main(String[] args) throws InterruptedException, IOException {

        WebDriver driver = new ChromeDriver();
        Google_apps(driver, "youtube");

    }
}
