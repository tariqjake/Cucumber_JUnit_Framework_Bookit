package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RoomPage extends NavigationMenu {

    public RoomPage() {
        PageFactory.initElements(Driver.getDriver(),
                this);
    }

    @FindBy(xpath = "(//p[@class='subtitle is-7'])[1]")
    public WebElement capacityQuote;

}
