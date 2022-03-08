package tests.other;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ListArrayTest {

    @Test
    public void testYandex() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://market.yandex.ru/catalog--monitory/22492251/list");
        List<WebElement> elements = driver.findElements(By.xpath("//*[@class=\"_1exhF\"]"));

        int i = 1;
        for (WebElement checkBox : elements){
            System.out.println("Чек-бокс номер -> " + i);
            i++;
            checkBox.click();
            Thread.sleep(2000);
        }

        driver.quit();
    }
}
