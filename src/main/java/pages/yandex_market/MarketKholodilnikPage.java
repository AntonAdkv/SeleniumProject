package pages.yandex_market;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

public class MarketKholodilnikPage extends BasePage {
    public MarketKholodilnikPage(WebDriver driver) {
        super(driver);
    }

    private final By btnAllFilter = By.xpath("//span[contains(text(), 'Все фильтры')]/parent::*");
    private final By btnDeleteAllFilter = By.xpath("//span[contains(text(),'Сбросить фильтры')]");

    public MarketKholodilnikPage clickBtnAllFilter() {
        driver.findElement(btnAllFilter).click();
        return this;
    }

    public void checkButtonDeleteAllFilter() {
        WebElement element = driver.findElement(btnDeleteAllFilter);
        waitElementIsVisible(element);
    }
}
