package samoiloff90.github.io;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;
import static samoiloff90.github.io.TestData.urlRepo;

public class LambdaStepsThroughStep extends TestBase{
    @Test
    public void testLambdaSteps() {
        step ("Ищем репозиторий " + urlRepo, () -> {
            $(".header-search-input").setValue(urlRepo).pressEnter();
            $("a[href*='Samoiloff90/junitForDns']").click();
        });
        step("Проверяем, что существует Issue", () -> {
            $("[data-content='Issues']").shouldHave(text("Issues"));
        });
    }

    @Test
    public void testAnnotatedSteps() {
        StepsWithStepAnnotation step = new StepsWithStepAnnotation();
        step.searchForRepository(urlRepo);
        step.takeScreenshot();
    }
}