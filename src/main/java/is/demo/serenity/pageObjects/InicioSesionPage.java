package is.demo.serenity.pageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class InicioSesionPage extends PageObject {

    private final By txtUsuario = By.id("LoginPanel0_Username");
    private final By txtContrasena = By.id("LoginPanel0_Password");
    private final By btnInicioSesion= By.xpath("//button[@id='LoginPanel0_LoginButton']");

    public By getTxtUsuario() {
        return txtUsuario;
    }

    public By getTxtContrasena() {
        return txtContrasena;
    }

    public By getBtnInicioSesion() {
        return btnInicioSesion;
    }
}
