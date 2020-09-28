package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PetBookAllResultsPage {

    public static final String PET_BOOK_HOME_PAGE = "http://localhost:4200";

    public static Target BUTTON_ALL = Target.the("boton de all busqueda")
            .located(By.xpath("//*[@id=\"All\"]"));

    public static Target BUTTON_PERRO = Target.the("boton de all busqueda")
            .located(By.xpath("//*[@id=\"Perro\"]"));

    public static Target BUTTON_GATO = Target.the("boton de all busqueda")
            .located(By.xpath("//*[@id=\"Gato\"]"));

    public static Target PERRO1_RESULTADO = Target.the("perro1 imagen")
            .located(By.xpath("//*[@id=\"assets/images/perro1.jpg\"]"));

    public static Target PERRO2_RESULTADO = Target.the("perro2 imagen")
            .located(By.xpath("//*[@id=\"assets/images/perro2.jpg\"]"));

    public static Target PERRO3_RESULTADO = Target.the("perro3 imagen")
            .located(By.xpath("//*[@id=\"assets/images/perro3.jpg\"]"));

    public static Target GATO1_RESULTADO = Target.the("gato1 imagen")
            .located(By.xpath("//*[@id=\"assets/images/gato1.jpg\"]"));

    public static Target GATO2_RESULTADO = Target.the("gato2 imagen")
            .located(By.xpath("//*[@id=\"assets/images/gato2.jpeg\"]"));


    public static  Map<String, Target> getResults()
    {
        Map<String, Target> results= new HashMap<String, Target>();
        results.put("assets/images/perro1.jpg", PERRO1_RESULTADO);
        results.put("assets/images/perro2.jpg", PERRO2_RESULTADO);
        results.put("assets/images/perro3.jpg", PERRO3_RESULTADO);
        results.put("assets/images/gato1.jpg", GATO1_RESULTADO);
        results.put("assets/images/gato2.jpeg", GATO2_RESULTADO);

        return results;
    }
}
