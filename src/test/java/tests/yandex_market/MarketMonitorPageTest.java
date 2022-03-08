package tests.yandex_market;

import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import static constansts.Constant.Urls.MARKET_URL_MONITOR;

public class MarketMonitorPageTest extends BaseTest {

    //TODO: Добавить скриншоты

    @Test
    public void checkIsRedirectToCart() throws InterruptedException {
        basePage.goToUrl(MARKET_URL_MONITOR);
        Thread.sleep(10000);
        marketMonitorPage.selectCheckBoxMonitor();
        marketMonitorPage.clickBtnInCart();
        marketMonitorPage.checkFrame();
    }
}
