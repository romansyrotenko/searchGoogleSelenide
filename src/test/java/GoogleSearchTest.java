import org.junit.After;
import org.junit.Test;
import pages.ResultsPage;
import pages.SearchPage;

import static com.codeborne.selenide.Selenide.close;

public class GoogleSearchTest {

    SearchPage main = new SearchPage();
    ResultsPage results = new ResultsPage();

    @After
    public void closeDriver() {
        close();
    }

    @Test
    public void testSearchAndCheckLinkCheckPicture() {

        main.openPage();
        main.search("selenide");
        results.check(0, "selenide.org");

        results.goTab("Images");
        results.checkImage(0, "352 × 186 - selenide.org");

        results.goTab("All");
        results.check(0, "selenide.org");

    }
}
