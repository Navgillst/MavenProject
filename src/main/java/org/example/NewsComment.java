package org.example;

//importing org.openqa.selenium package to use method By
import org.openqa.selenium.By;
//importing org.openqa.selenium.WebDriver package
import org.openqa.selenium.WebDriver;
//importing org.openqa.selenium.ChromeDriver package
import org.openqa.selenium.chrome.ChromeDriver;

public class NewsComment
{
    //imported selenium WebDriver interface using Maven dependency to perform automation task
    protected static WebDriver driver;

    public static void main(String[] args)
    {
        //set driver path for Chrome browser
        System.setProperty("webdriver.chrome.driver","src/test/java/drivers/chromedriver.exe");

        //opening Chrome browser
        driver = new ChromeDriver();

        //Keeping the browser in full screen mode
        driver.manage().window().maximize();

        //opening demo.nopcommerce.com website with get() method through the object driver
        driver.get("https://demo.nopcommerce.com/");

        //going to the 'DETAILS' button with its locator by xpath using the method 'findElement' with object(driver) of its class and performing click action
        driver.findElement(By.xpath("//div[@class=\"news-items\"]/div[2]/div[3]/a ")).click();

        //going to 'Title' field with its locator by id using the method 'findElement' with object(driver) of its class and adding Title
        driver.findElement(By.id("AddNewComment_CommentTitle")).sendKeys("Computer Review");

        //going to 'Comment' field with its locator by id using the method 'findElement' with object(driver) of its class and adding Comment
        driver.findElement(By.id("AddNewComment_CommentText")).sendKeys("It is working really well");

        //going to the 'NEW COMMENT' button with its locator by xpath using the method 'findElement' with object(driver) of its class and performing click action
        driver.findElement(By.xpath("//button[@name=\"add-comment\"]")).click();

        //putting the text value of the string in variable commentMsg with its locator by using method getText();
        String commentMsg = driver.findElement(By.className("result")).getText();

        //printing the value of the variable commentMsg
        System.out.println(commentMsg);

        driver.quit();
    }
}
