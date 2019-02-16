package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.MapPage;
import pages.RoomPage;
import pages.SignInPage;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.Map;

public class RoomsQuotes_steps {

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("user logs in using {string} and {string}")
    public void user_logs_in_using_and(String email, String password) {
        SignInPage signInPage = new SignInPage();
        signInPage.login(email, password);
    }

    @Then("user should be able to see quotes info for each room")
    public void user_should_be_able_to_see_quotes_info_for_each_room(Map<String, String> rooms) throws InterruptedException {

        System.out.println(rooms.keySet());
        for (String room:rooms.keySet()) {
            MapPage mapPage = new MapPage();
            mapPage.selectRoom(room).click();

            RoomPage roomPage = new RoomPage();
            BrowserUtils.waitForVisibility(roomPage.capacityQuote);
            Assert.assertEquals("The room quote verification faile",rooms.get(room), roomPage.capacityQuote.getText());
            BrowserUtils.waitForVisibility(mapPage.map);
            mapPage.map.click();
        }
    }
}
