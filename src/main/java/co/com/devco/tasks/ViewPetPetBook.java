package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

import static co.com.devco.userinterfaces.PetBookViewPetPage.IMAGE_PERRO;
import static co.com.devco.userinterfaces.PetBookAllResultsPage.PET_BOOK_HOME_PAGE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ViewPetPetBook implements Task {

    public ViewPetPetBook() {
    }

    public static Performable find() {
        return instrumented(ViewPetPetBook.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(PET_BOOK_HOME_PAGE),
                Click.on(IMAGE_PERRO)
        );
    }
}
