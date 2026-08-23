package Dropdown;

import Screenshots.Unsplash;
import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;


public class Googlemaps {

    public static WebDriver driver;

    public static void maproute() throws InterruptedException, IOException {
        driver = new ChromeDriver();

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

        WebElement maps = driver.findElement(By.xpath("//span[@data-text='Maps']"));
        maps.click();
        driver.switchTo().defaultContent();
        Thread.sleep(3000);


        //Explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        WebElement layout = driver.findElement(By.xpath("//button[@class='yHc72 qk5Wte']"));
        wait.until(ExpectedConditions.elementToBeClickable(layout));
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

        WebElement carroute = driver.findElement(By.xpath("//div[@aria-label='Driving']"));
        carroute.click();
        Thread.sleep(3000);

        fullpageSS("Routes");
        Thread.sleep(2000);


        //number of icons
        List<WebElement> caricon = driver.findElements(By.xpath("//span[@aria-label='Driving']"));
        WebElement carimage = driver.findElement(By.xpath("//span[@aria-label='Driving']"));


        for (int i = 1; i <= caricon.size(); i++) {

            Thread.sleep(1000);
            WebElement Car_route = driver.findElement(By.xpath("(//h1[@class='VuCHmb fontHeadlineSmall '])[" + i + "]"));
            WebElement timing = driver.findElement(By.xpath("(//div[contains(@class,'Fk3sm fontHeadlineSmall')])[" + i + "]"));
            WebElement distance = driver.findElement(By.xpath("(//div[@class='ivN21e tUEI8e fontBodyMedium'])[" + i + "]"));

            System.out.println("Route: " + Car_route.getText() + "\nTiming: " + timing.getText() + "\nDistance: " + distance.getText());

        }


        driver.findElement(By.xpath("//div[@data-trip-index='2']")).click();
        fullpageSS("route3");

        driver.findElement(By.xpath("//div[@data-trip-index='1']")).click();
        fullpageSS("route2");

        driver.findElement(By.xpath("//div[@data-trip-index='0']")).click();
        fullpageSS("route1");


        System.out.println("\n==========================================\n");

        WebElement bikeroute = driver.findElement(By.xpath("//div[@aria-label='Two-wheeler']"));
        bikeroute.click();
        Thread.sleep(2000);

        List<WebElement> bikeicon = driver.findElements(By.xpath("//span[@aria-label='Two-wheeler']"));


        for (int i = 1; i <= bikeicon.size(); i++) {
            Thread.sleep(2000);
            WebElement Bike_route = driver.findElement(By.xpath("(//h1[@class='VuCHmb fontHeadlineSmall '])[" + i + "]"));
            WebElement timing = driver.findElement(By.xpath("(//div[contains(@class,'Fk3sm fontHeadlineSmall')])[" + i + "]"));
            WebElement distance = driver.findElement(By.xpath("(//div[@class='ivN21e tUEI8e fontBodyMedium'])[" + i + "]"));

            System.out.println("Bike Route: " + Bike_route.getText() + "\nTiming: " + timing.getText() + "\nDistance: " + distance.getText());

        }

        System.out.println("\n==========================================\n");

        WebElement walking = driver.findElement(By.xpath("//div[@aria-label='Walking']"));
        walking.click();
        Thread.sleep(2000);


        List<WebElement> walkicon = driver.findElements(By.xpath("//span[@aria-label='Walking']"));


        for (int i = 1; i <= walkicon.size(); i++) {
            Thread.sleep(2000);
            WebElement Walking_route = driver.findElement(By.xpath("(//h1[@class='VuCHmb fontHeadlineSmall '])[" + i + "]"));
            WebElement timing = driver.findElement(By.xpath("(//div[@class='Fk3sm fontHeadlineSmall'])[" + i + "]"));
            WebElement distance = driver.findElement(By.xpath("(//div[@class='ivN21e tUEI8e fontBodyMedium'])[" + i + "]"));

            System.out.println("Walking Route: " + Walking_route.getText() + "\nTiming: " + timing.getText() + "\nDistance: " + distance.getText());

        }

        WebElement closedirections = driver.findElement(By.xpath("//button[@aria-label='Close directions']"));
        closedirections.click();
        Thread.sleep(1000);

        WebElement zoomout = driver.findElement(By.xpath("//button[@aria-label='Zoom out']"));

        while (zoomout.isEnabled()) {
            Thread.sleep(500);
            zoomout.click();
        }

        Thread.sleep(5000);
        //driver.quit();


    }

    public static void fullpageSS(String image_name) throws IOException, InterruptedException {


        TakesScreenshot ss = (TakesScreenshot)driver;
        File screenshot = ss.getScreenshotAs(OutputType.FILE);
        File path = new File("C:/Users/Rajkumar/IdeaProjects/Selinum Project/Google_maps_screenshot/"+image_name+".png");
        Files.copy(screenshot, path);
        Thread.sleep(2000);
    }



    public static void main(String[] args) throws InterruptedException, IOException {



        maproute();

    }
}
