package tests;

import helpers.AppSteps;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class SearchTests extends TestBase {
    AppSteps appSteps = new AppSteps();

    @Test
    @DisplayName("Проверка поисковой выдачи")
    void androidSuccessfulSearchTest() {
        appSteps.findArticle("Appium");
        appSteps.checkArticleExisting();
    }

    @Test
    @DisplayName("Проверка получения ошибки при переходе на статью")
    void androidUnsuccessfulOpenArticleTest() {
        appSteps.findArticle("Java");
        appSteps.openFirstArticle();
        appSteps.checkErrorPage();
    }
}