import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;
import java.util.concurrent.TimeUnit;


public class MoodleTest {


    @Test
    public void MoodleLogin() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://moodle.chnu.edu.ua/login/index.php");
        webDriver.manage().timeouts().implicitlyWait(40, TimeUnit.MINUTES);
        webDriver.findElement(By.xpath("//*[@id=\"region-main\"]/div/div/div/div/div/div/div[2]/div[1]/div/a")).click();
        webDriver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("prokopets.yevhen@chnu.edu.ua");
        webDriver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button")).click();
        webDriver.findElement(By.name("password")).sendKeys("Toradora1");
        webDriver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button")).click();
        webDriver.findElement(By.xpath("//*[@id=\"searchBtn\"]")).click();
        webDriver.findElement(By.className("form-control")).sendKeys("розробка додатків");
        webDriver.findElement(By.className("form-control")).sendKeys(Keys.ENTER);
        }

    @Test
    public void MoodleTest1() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://moodle.chnu.edu.ua/login/index.php");
        webDriver.manage().timeouts().implicitlyWait(40, TimeUnit.MINUTES);
        webDriver.findElement(By.xpath("//*[@id=\"region-main\"]/div/div/div/div/div/div/div[2]/div[1]/div/a")).click();
        webDriver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("prokopets.yevhen@chnu.edu.ua");
        webDriver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button")).click();
        webDriver.findElement(By.name("password")).sendKeys("Toradora1");
        webDriver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button")).click();
        webDriver.findElement(By.className("caret")).click();
        webDriver.findElement(By.xpath("//*[@id=\"action-menu-1-menu\"]/a[2]")).click();
        webDriver.findElement(By.xpath("//*[@id=\"region-main\"]/div/div/div/section[4]/div/ul/li[1]/span/a\n")).click();
        webDriver.findElement(By.xpath("//*[@id=\"region-main\"]/div/div/a")).click();
        webDriver.findElement(By.xpath("//*[@id=\"id_subject\"]")).sendKeys("Я був дуже радий тут вчитися");
        webDriver.findElement(By.xpath("//*[@id=\"id_summary_editoreditable\"]")).sendKeys("Навчання в університеті допомогло мені знайти те чим я хочу займатись");
        webDriver.findElement(By.xpath("//*[@id=\"id_submitbutton\"]")).click();
    }
}



