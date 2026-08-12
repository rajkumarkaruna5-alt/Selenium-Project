package Navigate;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class seliniumrevision {


    public static void demo_site_automation() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.get("https://demo.automationtesting.in/Register.html");
        Thread.sleep(2000);

        WebElement firstname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        firstname.sendKeys("Rajkumar");
        Thread.sleep(2000);

        WebElement lastname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
        lastname.sendKeys("Karuna");
        Thread.sleep(2000);

        WebElement address = driver.findElement(By.xpath("//textarea[@rows='3']"));
        address.sendKeys("No 123," +Keys.ENTER+"Chennai,"+Keys.ENTER+"Tamil Nadu");
        Thread.sleep(2000);

        WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
        email.sendKeys("rajkumar@gmal.com");
        Thread.sleep(2000);

        WebElement phone = driver.findElement(By.xpath("//input[@type='tel']"));
        phone.sendKeys("7263928367");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@value='Male']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@value='Cricket']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@value='Movies']")).click();
        Thread.sleep(2000);

        WebElement language = driver.findElement(By.xpath("//div[@id='msdd']"));
        language.click();
        Thread.sleep(1000);

        WebElement russian = driver.findElement(By.xpath("//a[text()='Russian']"));

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView()",russian );
        Thread.sleep(1000);
        russian.click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//label[text()='Skills']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//select[@id='Skills']")).click();
        Thread.sleep(2000);

        WebElement skills = driver.findElement(By.xpath("//option[@value='Java']"));
        js.executeScript("arguments[0].scrollIntoView()",skills );
        Thread.sleep(1000);
        skills.click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//label[text()='Country*']")).click();
        Thread.sleep(1000);

        WebElement country = driver.findElement(By.xpath("//span[@role='presentation']"));
        country.click();
        Thread.sleep(2000);
        WebElement search = driver.findElement(By.xpath("//input[@type='search']"));
        search.sendKeys("India", Keys.ENTER);
        Thread.sleep(2000);

        driver.findElement(By.xpath("//select[@placeholder='Year']")).click();
        Thread.sleep(2000);

        WebElement year = driver.findElement(By.xpath("//option[@value='1954']"));
        js.executeScript("arguments[0].scrollIntoView()", year);
        Thread.sleep(1000);
        year.click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//select[@placeholder='Month']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//option[@value='April']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//select[@placeholder='Day']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//option[@value='11']")).click();
        Thread.sleep(2000);

        WebElement password = driver.findElement(By.xpath("//input[@id='firstpassword']"));
        password.sendKeys("raj@123");
        Thread.sleep(2000);

        WebElement confirmpassword = driver.findElement(By.xpath("//input[@id='secondpassword']"));
        confirmpassword.sendKeys("raj@123");
        Thread.sleep(2000);

        WebElement submitbutton = driver.findElement(By.xpath("//button[@id='submitbtn']"));
        submitbutton.click();
        Thread.sleep(6000);

        driver.quit();


    }

    public static void main(String[] args) throws InterruptedException {

        demo_site_automation();

    }



}
