package pages;

import org.openqa.selenium.By;
import utils.User;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private final static By LOGIN_FIELD = By.xpath("//*[@id=\"field_email\"]");
    private final static By PASSWORD_FIELD = By.xpath("//*[@id=\"field_password\"]");
    private final static By LOGIN_BUTTON = By.xpath("//*[@class=\"login-form-actions\"]/input");


    public MainPage logIn(User user) {
        $(LOGIN_FIELD).sendKeys(user.getLogin());
        $(PASSWORD_FIELD).sendKeys(user.getPassword());
        $(LOGIN_BUTTON).click();
        return new MainPage();
    }
}
