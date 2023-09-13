package org.wikipedia.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import org.wikipedia.userinterfaces.Search;

public class SearchHistory implements Task
{
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(Search.HISTORY),
                Click.on(Search.FIRST_OPTION),
                Click.on(Search.SECOND_OPTION),
                Click.on(Search.SEARCH_SELECT));
    }
}
