package common;

public class Config {
    /**
     * Выбор браузера для теста
     * CHROME
     * MOZILLA
     *
     **/
    public static final String BROWSER = "CHROME";

//    /**
//     * Удаление COOKIES после каждой итерации
//     *
//     **/
    //public static final Boolean CLEAR_COOKIES = true;

    /**
     * для @AfterAll аннотации
     * закрываем браузер
     **/
    public static final Boolean BROWSER_OPEN = true;
}
