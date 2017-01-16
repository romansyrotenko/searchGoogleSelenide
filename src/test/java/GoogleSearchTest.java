import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;


public class GoogleSearchTest {

    @Test
    public void testSearchAndFollowLink() {

        open("http://google.com/ncr");
        $(By.name("q")).val("selenide").pressEnter();
        checkSearchResult(0, "selenide.org");

        goTo("Images");
        $$(By.cssSelector(".rg_ic")).get(0).hover();
        $$(By.cssSelector(".rg_ilmn")).get(0).shouldHave(text("352 × 186 - selenide.org"));

        goTo("All");
        checkSearchResult(0, "selenide.org");

        close();
    }

    private void checkSearchResult(int index, String text) {
        $$(By.cssSelector(".s  ._Rm")).get(index).shouldHave(text(text));
    }

    private void goTo(String linkText) {
        $(By.linkText(linkText)).click();
    }
}
