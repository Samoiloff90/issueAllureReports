package samoiloff90.github.io;


import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Configuration.browserSize;
import static com.codeborne.selenide.Selenide.open;

public class TestBaseListener extends TestBase{
    @BeforeEach
    void precondition() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        open("https://github.com/");
        browserSize = "1920x1080";
    }
}