package tests.other;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.Logs;

import java.util.Arrays;
import java.util.Set;

public class LogsBrowserTest {

    @Test
    public void logsBrowserTest() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        ChromeOptions opt = new ChromeOptions();

        /**
         * Отключаем w3c
         * */
        opt.setExperimentalOption("w3c", false);
        ChromeDriver driver = new ChromeDriver(opt);
        driver.get("https://www.1tv.ru/25q");

        /**
         * Задаем размер окна браузера
         * */
        driver.manage().window().setSize(new Dimension(700, 700));
        System.out.println("Размер окна -> " + driver.manage().window().getSize());
        System.out.println("Начальное расположение окна -> " + driver.manage().window().getPosition());
        driver.manage().window().setPosition(new Point(50, 300));
        System.out.println("Конечное расположение окна -> " + driver.manage().window().getPosition());

        /**
         * Логи из консоли браузера
         * */
        Set<String> allLogsType = driver.manage().logs().getAvailableLogTypes();
        System.out.println("Доступные типы логов -> " + allLogsType);
        LogEntries log1 = driver.manage().logs().get(LogType.BROWSER);
        for (
                LogEntry entry1 : log1
        )
            System.out.println("Логи браузера -> " + log1);

        LogEntries log2 = driver.manage().logs().get(LogType.CLIENT);
        for (
                LogEntry entry2 : log2
        )
            System.out.println("Логи клиента -> " + log2);

        Thread.sleep(10000);
        driver.quit();
    }
}
