package tests.other;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tests.yandex_market.MarketKholodilnikTest;

import java.util.Set;

public class LogbackTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(LogbackTest.class);

    /**
     * При выполнение теста логи сохраняются в папке logs
     * в текущем проекте
     */
    @Test
    public void logbackTest() throws InterruptedException {
        LOGGER.info("Метод logbackTest()");
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");

        /**
         * Получить список все кук на сайте
         * */
        Set<Cookie> cookies = driver.manage().getCookies();
        System.out.println("Список кук на сайте -> " + cookies);
        LOGGER.info("Метод logbackTest()");

        Thread.sleep(10000);
        driver.quit();
    }
}
