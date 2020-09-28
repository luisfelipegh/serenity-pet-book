package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;

public class PetBookViewPetPage {

    public static Target IMAGE = Target.the("ver una sola mascota")
            .located(By.xpath("/html/body/app-root/div/ng-component/div/div/div"));
}
