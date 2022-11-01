package org.example;

//importing org.openqa.selenium package to use method By
import org.openqa.selenium.By;
//importing org.openqa.selenium.WebDriver package
import org.openqa.selenium.WebDriver;
//importing org.openqa.selenium.ChromeDriver package
import org.openqa.selenium.chrome.ChromeDriver;

public class Products
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

        //going to the 'computers' category with its locator by xpath and performing click(); action
        driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/computers\"]\n")).click();

        //going to the 'Desktops' category with its locator by xpath and performing click(); action
        driver.findElement(By.xpath("//ul[@class=\"sublist\"]/li[1]/a")).click();

        //putting the text value of the string in variable text1 with its locator by using method getText();
        String text1 =driver.findElement(By.xpath("//div[@class=\"product-grid\"]/div/div/div/div[2]/h2/a[@href=\"/build-your-own-computer\"]")).getText();
        //putting the text value of the string in variable text2 with its locator by using method getText();
        String text2 =driver.findElement(By.xpath("//div[@class=\"product-grid\"]/div/div/div/div[2]/h2/a[@href=\"/digital-storm-vanquish-3-custom-performance-pc\"]")).getText();
        //putting the text value of the string in variable text3 with its locator by using method getText();
        String text3 =driver.findElement(By.xpath("//div[@class=\"product-grid\"]/div/div/div/div[2]/h2/a[@href=\"/lenovo-ideacentre-600-all-in-one-pc\"]")).getText();
        //printing the value of variable text1
        System.out.println(text1);
        //printing the value of variable text2
        System.out.println(text2);
        //printing the value of variable text3
        System.out.println(text3);
        driver.quit();


    }
}
