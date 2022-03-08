package tests.yandex_market;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tests.base.BaseTest;
import tests.other.LogbackTest;

import static constansts.Constant.Urls.MARKET_URL_KHOLODILNIK;

public class MarketKholodilnikTest extends BaseTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(MarketKholodilnikTest.class);

    @Test
    public void checkButtonDeleteAllFilter() throws InterruptedException {
        LOGGER.info("Тест logback в методе checkButtonDeleteAllFilter() ");
        basePage.goToUrl(MARKET_URL_KHOLODILNIK);
        Thread.sleep(11000);
        marketKholodilnikPage.clickBtnAllFilter();
        marketKholodilnikPage.checkButtonDeleteAllFilter();
        LOGGER.info("Тест logback в методе checkButtonDeleteAllFilter() ");
    }
}
