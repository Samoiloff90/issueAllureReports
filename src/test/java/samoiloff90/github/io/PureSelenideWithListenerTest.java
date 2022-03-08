package samoiloff90.github.io;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static samoiloff90.github.io.TestData.urlRepo;

public class PureSelenideWithListenerTest extends TestBaseListener{

    @Test
    public void testIssueSearch() {
        $(".header-search-input").setValue(urlRepo).pressEnter();
        $("a[href*='Samoiloff90/junitForDns']").click();
        $("[data-content='Issues']").shouldHave(text("Issues"));
    }

    @Test
    public void searchTeam() {
        $x("//a[text()='Team']").click();
        $x("//h1[text()='Build like the best teams on the planet']").shouldHave(text("Build like the best teams on the planet"));
    }

    @Test
    public void searchEnterprise() {
        $x("//a[text()='Enterprise']").click();
        $x("//h1[text()='Build like the best']").shouldHave(text("Build like the best"));
    }
}