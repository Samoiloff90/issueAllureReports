package samoiloff90.github.io;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;


public class PureSelenideWithListenerTest extends TestBase{

    @Test
    public void testIssueSearch() {
        $(".header-search-input").setValue("Samoiloff90/junitForDns").pressEnter();
        $("a[href*='Samoiloff90/junitForDns']").click();
        $("[data-content='Issues']").shouldHave(text("Issues"));
    }
}
