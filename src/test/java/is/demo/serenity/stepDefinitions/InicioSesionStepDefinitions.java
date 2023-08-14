package is.demo.serenity.stepDefinitions;

import io.cucumber.java.es.*;
import is.demo.serenity.steps.InicioSesionSteps;
import is.demo.serenity.steps.TableroSteps;
import net.thucydides.core.annotations.Steps;

public class InicioSesionStepDefinitions {

    //Se llama la instancia inicioSesionSteps
    @Steps
    InicioSesionSteps inicioSesionSteps;
    @Steps
    TableroSteps tablero;

    @Dado("que el usuario abra la pagina correctamente")
    public void queElUsuarioAbraLaPaginaCorrectamente() {

        inicioSesionSteps.AbrirNavegador();
    }
    @Cuando("ingrese las credenciales del usuario y contraseña")
    public void ingreseLasCredencialesDelUsuarioYContraseña() {

        inicioSesionSteps.LimpiarCampo();
        inicioSesionSteps.EnviarUsuario();
        inicioSesionSteps.EnviarContraseña();
        inicioSesionSteps.ClicBoton();
    }
    @Entonces("podra ingresar correctamente")
    public void podraIngresarCorrectamente() {

        tablero.ValidarMSJ();
    }
}
