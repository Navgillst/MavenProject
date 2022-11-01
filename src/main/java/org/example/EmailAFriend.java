package org.example;

//importing org.openqa.selenium package to use method By
import org.openqa.selenium.By;

//importing org.openqa.selenium.WebDriver package
import org.openqa.selenium.WebDriver;

//importing org.openqa.selenium.ChromeDriver package
import org.openqa.selenium.chrome.ChromeDriver;

//public access modifier class with name EmailAFriend
public class EmailAFriend
{
    //imported selenium WebDriver interface using Maven dependency to perform automation task
    protected static WebDriver driver;

    public static void main(String[] args)
    {
        //set driver path for Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/java/drivers/chromedriver.exe");

        //opening Chrome browser
        driver = new ChromeDriver();

        //Keeping the browser in full screen mode
        driver.manage().window().maximize();

        //opening demo.nopcommerce.com website with get() method through the object driver
        driver.get("https://demo.nopcommerce.com/");

        //opening the 'picture of Apple Macbook' page with its locator by xpath using the method 'findElement' with object(driver) of its class and performing click action
        driver.findElement(By.xpath("//img[@alt=\"Picture of Apple MacBook Pro 13-inch\"]")).click();

        //opening the 'email a friend' page with its locator by class name using the method 'findElement' with object(driver) of its class and performing click action
        driver.findElement(By.className("email-a-friend")).click();

        //going to 'friend email' field with its locator by id using the method 'findElement' with object(driver) of its class and adding friends email id
        driver.findElement(By.id("FriendEmail")).sendKeys("abc@gmail.com");

        //going to 'your email address' field with its locator by id using the method 'findElement' with object(driver) of its class and adding my email id
        driver.findElement(By.id("YourEmailAddress")).sendKeys("navgillst@gmail.com");

        //going to 'personal message' field with its locator by id using the method 'findElement' with object(driver) of its class and adding message
        driver.findElement(By.id("PersonalMessage")).sendKeys("Hi, Check this out . Its really a good product");

        //going to the send mail with its locator by classname clicking on the button 'send mail'
        driver.findElement(By.className("buttons")).click();

        //putting the text value of the string in variable text with its locator by using method getText();
        String text = driver.findElement(By.xpath("//div[@class=\"message-error validation-summary-errors\"]//li")).getText();

        //printing the value of variable text
        System.out.println(text);

        driver.quit();



    }

}
