package org.wikipedia.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class Create
{
    public static final Target BUTTON_CREATE = Target.the("BUTTON_CREATE").located(By.xpath(
            "//li[@id='pt-createaccount-2']"));
    public static final Target USER = Target.the("USER").located(By.xpath(
            "//input[@id='wpName2']"));
    public static final Target PASSWORD = Target.the("PASSWORD").located(By.xpath(
            "//input[@id='wpPassword2']"));
    public static final Target CONFIRMATE_PASSWORD = Target.the("CONFIRMATE_PASSWORD").located(By.xpath(
            "//input[@id='wpRetype']"));
    public static final Target EMAIL = Target.the("EMAIL").located(By.xpath(
            "//input[@id='wpEmail']"));
    public static final Target CREATE_COUNT = Target.the("CREATE_COUNT").located(By.xpath(
            "//button[@id='wpCreateaccount']"));
}
