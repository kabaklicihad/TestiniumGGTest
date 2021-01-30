import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
public class test_deneme extends Helper{

        @Test
        public void GGTest() throws InterruptedException {


            String pageControl = takeText(By.xpath("//div//h3[text()='GittiGidiyor - Türkiye’nin Öncü Alışveriş Sitesi']"));
            Assert.assertEquals("GittiGidiyor - Türkiye’nin Öncü Alışveriş Sitesi",pageControl);
            click(By.xpath("//div[text()='Giriş Yap']"));
            click(By.xpath("//div//a//span[text()='Giriş Yap']"));

            sendKeys(By.cssSelector("#L-UserNameField"),"crypto9701@gmail.com");

            sendKeys(By.cssSelector("#L-PasswordField"),"c192837");

            click(By.cssSelector("#gg-login-enter"));

            //click(By.cssSelector("a[class='afterLoginURL']"));
            WebElement loginControl = findElement(By.xpath("(//div[text()='Hesabım'])[1]"));
            boolean account = loginControl.isDisplayed();
            Assert.assertTrue(account);
            sendKeys(By.name("k"),"bilgisayar");
            click(By.xpath("//button//span[text()='BUL']"));


            scrollDown("window.scrollTo(0, document.body.scrollHeight)");

            click(By.xpath("//li//a[text()='2']"));


            String pageControl2 = takeText(By.xpath("//li//a[text()='2']"));
            Assert.assertEquals("2" , pageControl2);


            WebElement Element = findElement(By.xpath("//div//h3//span[text() = 'VENTO VG04FE 4X120MM RGB FAN USB 3.0 ATX MIDTOWER BİLGİSAYAR KASASI']"));
            scrollDownToElement("arguments[0].scrollIntoView();",Element);

            click(By.xpath("//div//h3//span[text() = 'VENTO VG04FE 4X120MM RGB FAN USB 3.0 ATX MIDTOWER BİLGİSAYAR KASASI']"));
            String price1 = takeText(By.xpath("//div[text()='379,99 TL']"));


            click(By.cssSelector("#add-to-basket"));


            click(By.xpath("//div//span[text()='Sepet']"));

            String price2 = takeText(By.xpath("//div//strong[text()='379,99 TL']"));
            Assert.assertEquals(price1,price2);

            click(By.cssSelector("div>span[class='plus icon-plus gg-icon gg-icon-plus']"));
            WebElement data_value_2 = findElement(By.xpath("//div//input[@data-value='2']"));
            boolean status = data_value_2.isDisplayed();
            Assert.assertTrue(status);


            click(By.xpath("//div//a//span[text() = 'Sil']"));


            String emptyBasket = takeText(By.xpath("//div//h2[text() = 'Sepetinizde ürün bulunmamaktadır.']"));
            Assert.assertEquals("Sepetinizde ürün bulunmamaktadır." , emptyBasket);

        }

    }

