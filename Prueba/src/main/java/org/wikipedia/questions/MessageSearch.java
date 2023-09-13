package org.wikipedia.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static org.wikipedia.userinterfaces.Search.TITLE_SISTEMA;

public class MessageSearch implements Question
{
    @Override
    public String answeredBy(Actor actor) {
        return TITLE_SISTEMA.resolveFor(actor).getText();
    }
    public static MessageSearch is() {
        return new MessageSearch();
    }
}
