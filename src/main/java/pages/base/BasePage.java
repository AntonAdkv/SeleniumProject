package pages.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static constansts.Constant.TimeoutVariables.EXPLICIT_WAIT;

public class BasePage {

    public WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Метод для перехода на указанный URL
     **/
    public void goToUrl(String url) {
        driver.get(url);
    }

    /**
     * Явное ожидание элементов в DOM
     **/
    public WebElement waitElementIsVisible(WebElement element) {
        new WebDriverWait(driver, EXPLICIT_WAIT).until(ExpectedConditions.visibilityOf(element));
        return element;
    }
}
