package is.demo.serenity.pageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class NombreEmpleadoPage extends PageObject {
    private final By btnInicioSesion= By.xpath("//button[@id='LoginPanel0_LoginButton']");
    private final By ClicEnlase= By.xpath("(//a[@class=\"card-footer\"])[1]");
    private final By ClicOrden = By.xpath("//*[@data-item-id=\"11077\"]");
    private final  By ClicListaEmpleado = By.id("s2id_Serenity_Demo_Northwind_OrderDialog15_EmployeeID");
    private final By BtnGuardad = By.id("s2id_Serenity_Demo_Northwind_OrderDialog15_EmployeeID");

    public By getBtnInicioSesion() {
        return btnInicioSesion;
    }
    public By getClicEnlase() {return ClicEnlase; }
    public By getClicOrden() {return ClicOrden; }
    public By getClicListaEmpleado() {return ClicListaEmpleado; }

}
