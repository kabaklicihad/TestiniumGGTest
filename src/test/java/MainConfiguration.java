import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainConfiguration {
    protected WebDriver driver;
    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver","src//test//resources//chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.gittigidiyor.com/");
        driver.manage().window().maximize();
    }
    @After
    public void shutDown(){
        driver.quit();
    }
}
