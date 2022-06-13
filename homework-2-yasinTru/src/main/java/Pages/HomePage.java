package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HomePage {

    WebDriver driver;

    //constructor function
    public HomePage(WebDriver driver)
    {
        this.driver=driver;
        WebDriverManager.chromedriver().setup();

    }

    //Lc waikiki page and wait functions
    public void getPage()
    {

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.lcwaikiki.com/tr-TR/TR");
        driver.manage().window().maximize();

    }

    //clicking Accessory button
    public void getAccessory()
    {

        WebElement accessoryBtn= driver.findElement(By.xpath("//a[normalize-space()='Aksesuar']"));
        accessoryBtn.click();

    }

    //checking Accessory page
    public void checkAccessoryPage()
    {
        String checkAccessory= driver.getTitle();
        // Assert.assertEquals(checkAccessory,"kadın erkek çocuk bebek aksesuar - LC Waikiki");
        if (checkAccessory.contains("aksesuar - LC Waikiki")) {
            System.out.println(checkAccessory);
        }
        else
        {
            System.out.println("sayfa yüklenemedi.");
        }
    }
    //clicking Man Products button
    public void goBoyPage()
    {
        WebElement checkAccessory=driver.findElement(By.cssSelector("body > div:nth-child(11) > div:nth-child(1) > div:nth-child(8) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > a:nth-child(3)"));
        checkAccessory.click();
    }

    //checking Man Products page
    public void checkBoyPage()
    {
        //printing title to the console
        String checkBoypage= driver.getTitle();
        if (checkBoypage.contains("Erkek Aktif")) {
            System.out.println(checkBoypage);
        }
        else
        {
            System.out.println("Erkek Kategori sayfası yüklenemedi.");
        }
    }

}
