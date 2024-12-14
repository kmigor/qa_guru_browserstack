package screens;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.id;

public class MainScreen {
    private final SelenideElement wrapperInputLocator = $(accessibilityId("Search Wikipedia"));
    private final SelenideElement inputLocator = $(id("org.wikipedia.alpha:id/search_src_text"));
    private final ElementsCollection dropArticlesLocator = $$(id("org.wikipedia.alpha:id/page_list_item_title"));

    public void findArticle(String article) {
        wrapperInputLocator.click();
        inputLocator.sendKeys(article);
    }

    public void checkArticleExisting() {
        dropArticlesLocator.shouldHave(sizeGreaterThan(0));
    }

    public void openFirstArticle() {
        dropArticlesLocator.first().click();
    }
}