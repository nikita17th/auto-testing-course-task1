package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import pages.elements.FeedList;
import utils.FeedItem;

import static com.codeborne.selenide.Selenide.$;

public class MainPage extends AbstractPage {
    private final static By PHOTO = By.xpath("//*[@name = \"photo\"]");
    private final static By USER_NAME_FIELD = By.xpath("//*[@class=\"nav-side __navigation __user-main\"]//*[@class=\"tico ellip\"]");
    private final static By PAGE = By.xpath("//*[@class=\"nav-side __navigation __user-main\"]//*[@class=\"tico ellip\"]");

    private final FeedList feedList = new FeedList();

    public String getUserName() {
        return $(USER_NAME_FIELD).shouldBe(Condition.visible).text();
    }

    public boolean hasPhoto() {
        return $(PHOTO).exists();
    }

    public boolean hasUserNameField() {
        return $(USER_NAME_FIELD).exists();
    }

    public boolean hasFeedList() {
        return feedList.hasFeedList();
    }

    public FeedItem doRepost() {
        return feedList.doRepost();
    }

    public ProfilePage openProfilePage() {
        $(PAGE).scrollIntoView(false).click();
        return new ProfilePage();
    }
}
