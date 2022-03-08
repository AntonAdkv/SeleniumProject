package tests.base;

import common.CommonActions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import pages.yandex_market.MarketKholodilnikPage;
import pages.yandex_market.MarketMonitorPage;

//import static common.Config.CLEAR_COOKIES;
import static common.Config.BROWSER_OPEN;

//@Execution(ExecutionMode.CONCURRENT) //многопоточность
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {
    protected WebDriver driver = CommonActions.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected MarketMonitorPage marketMonitorPage = new MarketMonitorPage(driver);
    protected MarketKholodilnikPage marketKholodilnikPage = new MarketKholodilnikPage(driver);

//    @AfterEach
//    void clearCookiesAndLocalStorage() {
//        if (CLEAR_COOKIES) {
//            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
//            driver.manage().deleteAllCookies();
//            javascriptExecutor.executeScript("window.sessionStorage.clear()");
//        }
//    }

    @AfterAll
    void close(){
        if(BROWSER_OPEN){
            driver.close();
        }
    }
}
