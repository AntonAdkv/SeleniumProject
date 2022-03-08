package tests.other;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class CookieTest {
    @Test
    public void testCookie() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");

        /**
         * Получить список все кук на сайте
         * */
        Set<Cookie> cookies = driver.manage().getCookies();
        System.out.println("Список кук на сайте -> " + cookies);


        /**
         * Добавление кук. Авторизация
         * */
        driver.manage().addCookie(new Cookie("orangehrm", "ca6ffbf456f8017763609ca845c76a25"));
        driver.navigate().refresh();

        /**
         * Удаление всех кук и вывод списка кук
         * */
        driver.manage().deleteAllCookies();
        cookies = driver.manage().getCookies();
        System.out.println("Список кук после удаления всех кук -> " + cookies);

        Thread.sleep(10000);
        driver.quit();
    }
}
