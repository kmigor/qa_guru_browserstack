package screens;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class ErrorScreen {
    private final SelenideElement errorTextLocator = $(id("org.wikipedia.alpha:id/view_wiki_error_text"));

    public void checkPage(){
        errorTextLocator.shouldBe(Condition.visible);
    }
}