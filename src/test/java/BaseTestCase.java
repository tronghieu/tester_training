import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * ${CLASS}
 * Created by luuhieu on 5/31/17.
 */
public abstract class BaseTestCase {
    protected WebDriver driver;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        driver = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(driver, 3);
        //login
        driver.get("http://172.16.223.251:4001/#/login?r=/");
        wait.until(ExpectedConditions.titleContains("Đăng nhập"));
        driver.findElement(By.name("email")).sendKeys("cuongdola");
        driver.findElement(By.name("password")).sendKeys("123456");
        driver.findElement(By.name("btn-login")).click();
        wait.until(ExpectedConditions.titleContains("Danh sách vận đơn"));
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}
