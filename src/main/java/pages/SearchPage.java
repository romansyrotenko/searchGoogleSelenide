package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class SearchPage {

    public void openPage() {
        open("http://google.com/ncr");
    }

    public void search(String text) {
        $(By.name("q")).val(text).pressEnter();
    }
}
