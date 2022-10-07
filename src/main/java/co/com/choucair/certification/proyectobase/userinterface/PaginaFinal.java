package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaFinal {

    public static final Target CLAVE = Target.the("Clave de usuario")
            .located(By.id("password"));

    public static final Target CONFIRMAR_CLAVE = Target.the(" Confirmar Clave de usuario")
            .located(By.id("confirmPassword"));

    public static final Target CHECKBOX_01 = Target.the("Check_box01")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target CHECKBOX_02 = Target.the("Check_box02")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target CHECKBOX_03 = Target.the("Check_box03")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target BOTON_FINAL = Target.the("Boton para finalizar registro")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div/div/a"));
}
