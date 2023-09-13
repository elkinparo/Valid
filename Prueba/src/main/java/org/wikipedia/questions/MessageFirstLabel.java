package org.wikipedia.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static org.wikipedia.userinterfaces.Search.FIRST_LABEL;

public class MessageFirstLabel implements Question
{
    @Override
    public String answeredBy(Actor actor) {
        return FIRST_LABEL.resolveFor(actor).getText();
    }
    public static MessageFirstLabel is() {
        return new MessageFirstLabel();
    }
}
