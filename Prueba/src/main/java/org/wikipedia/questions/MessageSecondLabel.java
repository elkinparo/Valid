package org.wikipedia.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static org.wikipedia.userinterfaces.Search.SECOND_LABEL;

public class MessageSecondLabel implements Question
{
    @Override
    public String answeredBy(Actor actor) {
        return SECOND_LABEL.resolveFor(actor).getText();
    }
    public static MessageSecondLabel is() {
        return new MessageSecondLabel();
    }
}
