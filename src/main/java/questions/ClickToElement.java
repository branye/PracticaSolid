package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class ClickToElement implements Interaction {
    private Target element;

    public ClickToElement(Target element) {
        this.element = element;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(element));
    }

    public static ClickToElement targetElement(Target element) {
        return Tasks.instrumented(ClickToElement.class, element);
    }
}
