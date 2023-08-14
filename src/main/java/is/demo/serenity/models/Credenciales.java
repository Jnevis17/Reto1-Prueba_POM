package is.demo.serenity.models;

import is.demo.serenity.utils.Excel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class Credenciales {

    private static ArrayList<Map<String, String>> credenciales = new ArrayList<>();
     public static   ArrayList<Map<String, String>>data(){

    try {
        credenciales = Excel.leerDatosDeHojaDeExcel("C:\\Users\\Jnmur\\Desktop\\Serenity_POM\\Reto-PON-1-Serenity\\src\\test\\resources\\data\\Data.xlsx", "InicioSesion");
    }
    catch (IOException e) {
        throw new RuntimeException(e);
    }
    return credenciales;
   }
}


