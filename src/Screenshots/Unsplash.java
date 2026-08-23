package Screenshots;

import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Unsplash {



    public static WebDriver driver;

    public static void fullpageSS(String image_name) throws IOException, InterruptedException {


        TakesScreenshot ss = (TakesScreenshot)driver;
        File screenshot = ss.getScreenshotAs(OutputType.FILE);
        File path = new File("C:/Users/Rajkumar/IdeaProjects/Selinum Project/Screenshots/"+image_name+".png");
        Files.copy(screenshot, path);
        Thread.sleep(2000);

    }

    public static void single_images(WebElement element, String image1) throws IOException, InterruptedException {

        File screenshotAs = element.getScreenshotAs(OutputType.FILE);
        File path1 = new File("C:/Users/Rajkumar/IdeaProjects/Selinum Project/Screenshots/"+image1+".png");
        Files.copy(screenshotAs, path1);
        Thread.sleep(2000);

    }

    public static void Unsplash() throws IOException, InterruptedException {


        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://unsplash.com/");
        Thread.sleep(4000);
        fullpageSS("homepage");
        Thread.sleep(6000);
        WebElement firstimage = driver.findElement(By.xpath("//img[@alt='Traditional chinese archway with red lanterns on a bustling street.']/../../.."));
        single_images(firstimage , "image1");
        Thread.sleep(4000);
        WebElement secondimage = driver.findElement(By.xpath("//img[@alt='Parents lovingly hold their sleeping newborn baby.']/../../.."));
        single_images(secondimage, "image2");
        Thread.sleep(4000);
        driver.quit();

    }

    public static void main(String[] args) throws IOException, InterruptedException {

        Unsplash();



    }



}
