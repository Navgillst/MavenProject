package org.example;

//importing org.openqa.selenium package to use method By
import org.openqa.selenium.By;
//importing org.openqa.selenium.WebDriver package
import org.openqa.selenium.WebDriver;
//importing org.openqa.selenium.ChromeDriver package
import org.openqa.selenium.chrome.ChromeDriver;
//importing java.text.SimpleDataFormat package
import java.text.SimpleDateFormat;

//public access modifier class with name BasePage
public class BasePage
{
    //imported selenium WebDriver interface using Maven dependency to perform automation task
    protected static WebDriver driver;

    public static void main(String[] args)
    {
        //storing current year month  date hour minute and seconds in variable timeStamp
        String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());

        //printing the value of timeStamp
        System.out.println(timeStamp);

        //set driver path for Chrome browser
        System.setProperty("webdriver.chrome.driver","src/test/java/drivers/chromedriver.exe");

        //opening Chrome browser
        driver = new ChromeDriver();

        //Keeping the browser in full screen mode
        driver.manage().window().maximize();

        //opening demo.nopcommerce.com website with get() method through the object driver
        driver.get("https://demo.nopcommerce.com/");

        //clicking on the button register
        driver.findElement(By.className("ico-register")).click();

        //going to 'First name' field with its locator by id using the method 'findElement' with object(driver) of its class and adding first name
        driver.findElement(By.id("FirstName")).sendKeys("Navpreet");

        //going to 'Last name' field with its locator by id using the method 'findElement' with object(driver) of its class and adding Last name
        driver.findElement(By.id("LastName")).sendKeys("Gill");

        //going to 'Email' field with its locator by id using the method 'findElement' with object(driver) of its class and adding unique email address everytime
        driver.findElement(By.id("Email")).sendKeys("navgillst"+timeStamp+"@gmail.com");

        //going to 'Password' field with its locator by id using the method 'findElement' with object(driver) of its class and adding Password
        driver.findElement(By.id("Password")).sendKeys("Test12345");

        //going to 'Confirm password' field with its locator by id using the method 'findElement' with object(driver) of its class and adding same password again
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Test12345");

        //going to 'register' button with its locator by id using the method 'findElement' with object(driver) of its class and clicking on it
        driver.findElement(By.id("register-button")).click();

        //putting the text value of the string in variable regMsg with its locator by using method getText();
        String regMsg =driver.findElement(By.className("result")).getText();

        //printing the string value
        System.out.println(regMsg);

        driver.quit();

    }
}
