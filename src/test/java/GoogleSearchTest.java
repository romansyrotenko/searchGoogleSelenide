import com.codeborne.selenide.Configuration;
import org.junit.After;
import org.junit.Test;
import pages.ResultsPage;
import pages.SearchPage;

import java.util.Properties;

import static com.codeborne.selenide.Selenide.close;
import static core.Helpers.getProperties;

public class GoogleSearchTest {

    SearchPage main = new SearchPage();
    ResultsPage results = new ResultsPage();


    static {
        Properties properties = getProperties();
        Configuration.browser = properties.getProperty("browser");
    }

    @After
    public void closeDriver() {
        close();
    }

    @Test
    public void testSearchAndCheckLinkAndCheckPicture() {

        main.open();
        main.search("selenide");
        results.checkResult(0, "selenide.org");

        results.goTab("Images");
        results.checkImage(0, "352 × 186 - selenide.org");

        results.goTab("All");
        results.checkResult(0, "selenide.org");

    }
}
