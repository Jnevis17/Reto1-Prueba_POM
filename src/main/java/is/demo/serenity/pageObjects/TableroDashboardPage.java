package is.demo.serenity.pageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class TableroDashboardPage extends PageObject {
    //Validamos que el titulo h1 este visible en la vista de Dashboard
    @FindBy(xpath = "//h1[text()='Dashboard']")
    public WebElementFacade LblDashboard;
}
