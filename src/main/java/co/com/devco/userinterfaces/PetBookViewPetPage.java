package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;

public class PetBookViewPetPage {

    public static Target IMAGE_PERRO = Target.the("clic a primera mascota")
            .located(By.xpath("/html/body/app-root/div/app-imagegallery/div/div[3]/ul/li[1]/a"));

    public static Target IMAGE_RESULT = Target.the("ver una sola mascota")
            .located(By.xpath("/html/body/app-root/div/ng-component/div/div/div"));

}
