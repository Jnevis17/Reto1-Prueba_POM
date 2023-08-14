package is.demo.serenity.steps;

import is.demo.serenity.models.Credenciales;
import is.demo.serenity.pageObjects.InicioSesionPage;
import is.demo.serenity.utils.SeleccionEmpleado;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

//Creacion de la clase Step
public class InicioSesionSteps {

    //Se llama la instancia inicioSesionPage
    @Page
    InicioSesionPage inicio;
    @Page
    SeleccionEmpleado SeleccionEmplea;

    @Step("Abrir navegador ")
    public void AbrirNavegador(){
      inicio.openUrl( "https://demo.serenity.is/Account/Login/?ReturnUrl=%2F");
    }

    @Step("Limpiar los campos ")
    public void LimpiarCampo(){
        inicio.getDriver().findElement(inicio.getTxtUsuario()).clear();
        inicio.getDriver().findElement(inicio.getTxtContrasena()).clear();
    }

    @Step("Enviar datos del usuario ")

    public void EnviarUsuario(){
        String Usuario = Credenciales.data().get(0).get("Usuario");
        inicio.getDriver().findElement(inicio.getTxtUsuario()).sendKeys(Usuario);
    }
    @Step("Enviar datos contraseña ")

    public void EnviarContraseña(){
        String Clave = Credenciales.data().get(0).get("Clave");
        inicio.getDriver().findElement(inicio.getTxtContrasena()).sendKeys(Clave);
    }

    @Step("Dar clic al boton ")
    public void ClicBoton(){
        inicio.getDriver().findElement(inicio.getBtnInicioSesion()).click();
    }

    @Step(" Seleccionar Aleatoria")
    public void  SeleccionAleatoria() {SeleccionEmplea.seleccionEmpleadoRandom();}

}
