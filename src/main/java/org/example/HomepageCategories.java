package org.example;

//importing org.openqa.selenium package to use method By
import org.openqa.selenium.By;
//importing org.openqa.selenium.WebDriver package
import org.openqa.selenium.WebDriver;
//importing org.openqa.selenium.ChromeDriver package
import org.openqa.selenium.chrome.ChromeDriver;


public class HomepageCategories
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

        //putting the text value of the string in variable category1 with its locator by using method getText();
        String category1 = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/computers\"]\n")).getText();
        //putting the text value of the string in variable category2 with its locator by using method getText();
        String category2 = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/electronics\"]\n")).getText();
        //putting the text value of the string in variable category3 with its locator by using method getText();
        String category3 = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/apparel\"]\n")).getText();
        //putting the text value of the string in variable category4 with its locator by using method getText();
        String category4 = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/digital-downloads\"]\n")).getText();
        //putting the text value of the string in variable category5 with its locator by using method getText();
        String category5 = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/books\"]\n")).getText();
        //putting the text value of the string in variable category6 with its locator by using method getText();
        String category6 = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/jewelry\"]\n")).getText();
        //putting the text value of the string in variable category7 with its locator by using method getText();
        String category7 = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/gift-cards\"]\n")).getText();

        //printing the value of variable category1
        System.out.println(category1);
        //printing the value of variable category2
        System.out.println(category2);
        //printing the value of variable category3
        System.out.println(category3);
        //printing the value of variable category4
        System.out.println(category4);
        //printing the value of variable category5
        System.out.println(category5);
        //printing the value of variable category6
        System.out.println(category6);
        //printing the value of variable category7
        System.out.println(category7);
        driver.quit();


    }
}
