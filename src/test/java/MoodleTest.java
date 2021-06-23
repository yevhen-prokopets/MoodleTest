import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import java.util.concurrent.TimeUnit;


public class MoodleTest {


    @Test
    public void MoodleLogin() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://moodle.chnu.edu.ua/login/index.php");
        webDriver.manage().timeouts().implicitlyWait(40, TimeUnit.MINUTES);
        webDriver.findElement(By.xpath("//*[@id=\"region-main\"]/div/div/div/div/div/div/div[2]/div[1]/div/a")).click();
        webDriver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("prokopets.yevhen@chnu.edu.ua");
        webDriver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button")).click();
        webDriver.findElement(By.name("password")).sendKeys("Toradora1");
        webDriver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button")).click();

    }

    @Test
    public void Git() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://github.com/yevhen-prokopets");
        webDriver.findElement(By.xpath("//*[@id=\"js-contribution-activity\"]/div[2]/div/div[2]/div[2]/details/div/ul/li[2]/span[1]/span/a")).click();
    }
    @Test
    public void GitF() {
        System.setProperty("webdriver.geckodriver.driver", "D:\\firedriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://github.com/yevhen-prokopets");
        driver.findElement(By.xpath("//*[@id=\"js-contribution-activity\"]/div[2]/div/div[2]/div[2]/details/div/ul/li[2]/span[1]/span/a")).click();
    }
    @Test
    public void authenticateUsing() {
        WebDriver webDriver = new FirefoxDriver();
        webDriver.manage().deleteAllCookies();
        webDriver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        webDriver.get("https://moodle.chnu.edu.ua/login/index.php");
        webDriver.findElement(By.xpath("//*[@id=\"region-main\"]/div/div/div/div/div/div/div[2]/div[1]/div/a")).click();

    }
}