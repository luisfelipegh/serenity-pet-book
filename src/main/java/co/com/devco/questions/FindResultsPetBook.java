package co.com.devco.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Attribute;
import net.serenitybdd.screenplay.targets.Target;

import java.util.HashMap;
import java.util.Map;

import static co.com.devco.userinterfaces.PetBookAllResultsPage.*;

public class FindResultsPetBook implements Question<Boolean> {
    private String imagen;

    public FindResultsPetBook(String imagen){
        this.imagen = imagen;
    }

    public static FindResultsPetBook es(String imagen){
        return new FindResultsPetBook(imagen);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String resultadoEncontrado = Attribute.of(
                getResults().get(imagen)).named("src").viewedBy(actor).asString();
        return resultadoEncontrado.contains(imagen);
    }
}
