package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ResultsPage {

    public void checkResult(int index, String text) {
        $$(By.cssSelector(".s  ._Rm")).get(index).shouldHave(text(text));
    }

    public void goTab(String linkText) {
        $(By.linkText(linkText)).click();
    }

    public void checkImage(int index, String text) {
        $$(By.cssSelector(".rg_ic")).get(index).hover();
        $$(By.cssSelector(".rg_ilmn")).get(index).shouldHave(text(text));
    }
}
