package pages;


import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SearchPage {

    public void open() {
        Selenide.open("http://google.com/ncr");
    }

    public void search(String text) {
        $(By.name("q")).val(text).pressEnter();
    }
}
