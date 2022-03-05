package samoiloff90.github.io;

import org.junit.jupiter.api.BeforeEach;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Configuration.*;

public class TestBase {
    @BeforeEach
    void precondition() {
        open("https://github.com/");
        browserSize = "1920x1080";
    }
}
