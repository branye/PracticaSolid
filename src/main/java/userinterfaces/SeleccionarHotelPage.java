package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SeleccionarHotelPage {
    public static final Target DESTINATION =
            Target.the("campo - ciudad destino").located(By.xpath("//div[@id=\"s2id_autogen10\"]/a"));

    public static final Target OPT_DUBAI =
            Target.the("campo - ciudad destino").located(By.xpath("//div[@id=\"select2-drop\"]//div[contains(text(),'Dubai, United Arab')]"));

    public static final Target DATE_CHECK_IN =
            Target.the("campo - check in").located(By.id("checkin"));

    public static final Target DATE_CHECK_OUT =
            Target.the("campo - check out").located(By.id("checkout"));

    public static final Target BTN_NUMBER_ADULTS =
            Target.the("campo - Numero de adultos").located(By.xpath("//*[@id=\"hotels\"]/div/div/form/div/div/div[3]/div/div/div/div/div/div/div[1]/div/div[2]/div/span/button[1]"));

    public static final Target BTN_NUMBER_CHILD =
            Target.the("campo - Numero de niños").located(By.xpath("//*[@id=\"hotels\"]/div/div/form/div/div/div[3]/div/div/div/div/div/div/div[2]/div/div[2]/div/span/button[1]"));

    public static final Target BTN_SEARCH =
            Target.the("campo - Numero de niños").located(By.xpath("//form[@name=\"HOTELS\"]//button[contains(text(),'Search')]"));

}
