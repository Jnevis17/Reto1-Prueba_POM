package is.demo.serenity.utils;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

public class SeleccionEmpleado extends PageObject {
//Prueba
    //private By Seleccionador = By.cssSelector(".select2-results-dept-0");
    private By Seleccionador = By.cssSelector(".select2-results-dept-0");

    public void seleccionEmpleadoRandom() {

        WebElement dropdownElement = find(Seleccionador);
        Select empleado = new Select(dropdownElement);
        List<WebElement> options = empleado.getOptions();

        Random random = new Random();
        int randomIndex = random.nextInt(options.size());

        empleado.selectByIndex(randomIndex);

        WebElement selectedOption = options.get(randomIndex);
        selectedOption.click();
    }
}




