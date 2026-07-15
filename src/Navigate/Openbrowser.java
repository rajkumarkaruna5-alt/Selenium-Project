package Navigate;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openbrowser {
/*Requirement: Browser Window Operations and Navigation in ActiTime Application
1. Launch the Chrome browser.
2. Maximize the browser window.
3. Open the ActiTime application.
4. Verify and print the page title.
5. Verify and print the current URL.
6. Resize the browser window to 1000 × 700 using the Dimension class.
7. Move the browser window to the position (200, 100) using the Point class.
8. Navigate to the Google website.
9. Verify and print the Google page title.
10. Navigate back to the ActiTime application.
11. Refresh the current page.
12. Navigate forward to the Google page.
13. Minimize the browser window.
14. Close all browser windows.*/


    public static void main(String[] args) throws InterruptedException {


        ChromeDriver driver=new ChromeDriver();

        //Maximize the browser window
        driver.manage().window().maximize();
        Thread.sleep(4000);

        //Open the ActiTime
        driver.navigate().to("https://www.actitime.com");
        Thread.sleep(4000);

        //print the page title.
        String title= driver.getTitle();
        System.out.println("Title of the webpage: "+title);

        //print the current URL
        String currenturl= driver.getCurrentUrl();
        System.out.println("Current URL: "+currenturl);

        //Resize the browser window
        Dimension dimn=new Dimension(1000,700);
        driver.manage().window().setSize(dimn);
        Thread.sleep(4000);
        System.out.println("Current Dimension: "+dimn);

        //Move the browser window to the position
        Point p=new Point(200,100);
        driver.manage().window().setPosition(p);
        Thread.sleep(4000);
        System.out.println("Current Position: "+p);

        //Navigate to the Google website.
        driver.navigate().to("https://www.google.com");
        Thread.sleep(4000);
        String title2 =driver.getTitle();
        System.out.println("Title of the webpage: "+title2);

        //Navigate back
        driver.navigate().back();
        Thread.sleep(4000);

        //Refresh the current page.
        driver.navigate().refresh();
        Thread.sleep(4000);

        //Navigate forward
        driver.navigate().forward();
        Thread.sleep(4000);

        //Minimize the browser window.
        driver.manage().window().minimize();
        Thread.sleep(4000);

        //Close all browser windows
        driver.quit();

    }

}
