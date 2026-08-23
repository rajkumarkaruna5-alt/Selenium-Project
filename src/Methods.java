import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;

public class Methods {


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



}
