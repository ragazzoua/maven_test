import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * created by s.a.miroshnychenko 7/23/2018
 */

public class MyTest {
    @Test
    public void test1() {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mvnrepository.com");
        Assert.assertEquals("https://mvnrepository.com/", driver.getCurrentUrl());
        driver.quit();

    }


}
