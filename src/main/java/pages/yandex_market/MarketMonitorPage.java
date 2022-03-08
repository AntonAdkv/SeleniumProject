package pages.yandex_market;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

public class MarketMonitorPage extends BasePage {

    public MarketMonitorPage(WebDriver driver) {
        super(driver);
    }

    //WebDriverWait wait = new WebDriverWait(driver, 10);

    private final By checkBoxMonitor = By.xpath("//span[contains(text(), 'Acer') and @class='_1o8_r xUzR2']");
    private final By btnInCart = By.xpath("//span[contains(text(), 'корзину')]/ancestor::button");
    private final By frame = By.xpath("//div[@class=\'_1DZQJ\']");

    public MarketMonitorPage selectCheckBoxMonitor() {
        driver.findElement(checkBoxMonitor).click();
        return this;
    }

    public MarketMonitorPage clickBtnInCart() throws InterruptedException {
        Thread.sleep(3000);
        //wait.until(ExpectedConditions.elementToBeClickable(btnInCart));
        driver.findElement(btnInCart).click();
        return this;
    }

    public void checkFrame() {
        WebElement element = driver.findElement(frame);
        waitElementIsVisible(element);
    }
}
