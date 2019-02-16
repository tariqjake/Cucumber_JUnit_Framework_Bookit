package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class MapPage extends NavigationMenu {

    public MapPage() {
        PageFactory.initElements(Driver.getDriver(),
                this);
    }

    @FindBy(tagName = "h1")
    public WebElement header;

    @FindBy(linkText = "map")
    public WebElement map;

    @FindBy(className = "subtitle")
    public WebElement location;

    @FindBy(css = "a>span.room-name")
    public List<WebElement> allRooms;

    public WebElement selectRoom(String roomName) {
        return Driver.getDriver().findElement(By.linkText(roomName));
    }
}
