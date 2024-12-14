package helpers;

import io.qameta.allure.Step;
import screens.ErrorScreen;
import screens.MainScreen;

public class AppSteps {
    MainScreen mainScreen = new MainScreen();
    ErrorScreen errorScreen = new ErrorScreen();

    @Step("Вбить в поиске слово {article}")
    public void findArticle(String article) {
        mainScreen.findArticle(article);
    }

    @Step("Проверить, что в поисковой выдаче есть статьи по ключевому слову")
    public void checkArticleExisting() {
        mainScreen.checkArticleExisting();
    }

    @Step("Открыть первую статью")
    public void openFirstArticle() {
        mainScreen.openFirstArticle();
    }

    @Step("Проверить, что открылся экран с ошибкой")
    public void checkErrorPage() {
        errorScreen.checkPage();
    }
}