import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helper extends MainConfiguration {
    public WebElement findElement(By by){
        return driver.findElement(by);
    }
    public void click(By by) throws InterruptedException {
        delayMsec(3000);
        WebElement element = findElement(by);
        element.click();
        logger("Element is found and clicked.");
    }
    public void sendKeys(By by,String key ){
        WebElement element = driver.findElement(by);
        element.clear();
        logger("Element is cleaned.");
        element.sendKeys(key);
        logger("Text  is written to element");
    }
    public void delayMsec(int time) throws InterruptedException {
        Thread.sleep(time);
        logger(time + " Msec delay");
    }
    public String takeText(By by) throws InterruptedException {
        delayMsec(5000);
        WebElement element = findElement(by);
        logger("Text has been taken");
        return element.getText();
    }
    public void scrollDown(String input){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript(input);
    }
    public void scrollDownToElement(String key ,WebElement input){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript(key,input);
    }
    public void logger(String message){
        Logger logger = LogManager.getLogger(Helper.class);
        logger.info(message);
    }
}
