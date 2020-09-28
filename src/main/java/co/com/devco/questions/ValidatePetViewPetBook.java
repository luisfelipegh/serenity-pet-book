package co.com.devco.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Attribute;
import net.serenitybdd.screenplay.questions.CSSValue;

import static co.com.devco.userinterfaces.PetBookViewPetPage.IMAGE_RESULT;

public class ValidatePetViewPetBook implements Question<Boolean> {
    private String imagen;

    public ValidatePetViewPetBook(String imagen){
        this.imagen = imagen;
    }

    public static ValidatePetViewPetBook es(String imagen){
        return new ValidatePetViewPetBook(imagen);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String resultadoEncontrado = CSSValue.of(IMAGE_RESULT).named("background-image") .viewedBy(actor).asString();
        return resultadoEncontrado.contains(imagen);
    }
}
