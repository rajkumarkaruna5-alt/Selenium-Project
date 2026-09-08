package Frames;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameClass {


    public static void frametest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.get("https://ui.vision/demo/iframes");
        Thread.sleep(2000);

        WebElement frame1 = driver.findElement(By.xpath("//iframe[@width='650']"));
        driver.switchTo().frame(frame1);
        Thread.sleep(1000);

        WebElement question1 = driver.findElement(By.xpath("//div[@aria-label='I am a human']"));
        question1.click();
        Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor)driver;

        WebElement question2 = driver.findElement(By.xpath("//div[@aria-label='Form Autofilling']"));
        js.executeScript("arguments[0].scrollIntoView()", question2);
        Thread.sleep(1000);
        js.executeScript("arguments[0].click()", question2);
        Thread.sleep(2000);

        WebElement choose = driver.findElement(By.xpath("//span[text()='Choose']"));
        js.executeScript("arguments[0].click()", choose);
        Thread.sleep(2000);

        WebElement option2 = driver.findElement(By.xpath("(//div[@data-value='Well, now I know :-)'])[2]"));
        js.executeScript("arguments[0].click()", option2);
        Thread.sleep(2000);

        WebElement nextbutton = driver.findElement(By.xpath("//span[text()='Next']"));
        js.executeScript("arguments[0].click()", nextbutton);
        Thread.sleep(2000);

        WebElement shortanswer = driver.findElement(By.xpath("//input[@aria-labelledby='i1 i4']"));
        js.executeScript("arguments[0].value='Hi'", shortanswer);
        Thread.sleep(2000);

        WebElement longanswer = driver.findElement(By.xpath("//textarea[@aria-label='Your answer']"));
        js.executeScript("arguments[0].scrollIntoView()",longanswer);
        Thread.sleep(1000);
        js.executeScript("arguments[0].value='I am Rajkumar'", longanswer);
        Thread.sleep(2000);

        WebElement submitbutton = driver.findElement(By.xpath("//span[text()='Submit']"));
        js.executeScript("arguments[0].click()",submitbutton);
        Thread.sleep(2000);

        driver.switchTo().defaultContent();
        Thread.sleep(1000);
        driver.quit();


    }

    public static void main(String[] args) throws InterruptedException {

        frametest();

    }


}
