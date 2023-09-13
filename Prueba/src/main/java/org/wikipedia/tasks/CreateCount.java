package org.wikipedia.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.wikipedia.models.CreateCounts;
import org.wikipedia.userinterfaces.Create;

public class CreateCount implements Task
{
    CreateCounts data;

    public CreateCount(CreateCounts data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(Create.BUTTON_CREATE),
                Enter.theValue(data.getUSER()).into(Create.USER),
                Enter.theValue(data.getPASSWORD()).into(Create.PASSWORD),
                Enter.theValue(data.getPASSWORD()).into(Create.CONFIRMATE_PASSWORD),
                Enter.theValue(data.getEMAIL()).into(Create.EMAIL),
                Click.on(Create.CREATE_COUNT));
        WaitUntil.the(ExpectedConditions.alertIsPresent());
    }

    public static CreateCount format(CreateCounts data) {
        return Tasks.instrumented(CreateCount.class, data);
    }

}
