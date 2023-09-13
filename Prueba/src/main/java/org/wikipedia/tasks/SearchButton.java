package org.wikipedia.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import org.wikipedia.userinterfaces.Search;

public class SearchButton implements Task
{
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(Search.MOBILE_VERSION),
                Click.on(Search.MOBILE_VERSION));
    }
}
