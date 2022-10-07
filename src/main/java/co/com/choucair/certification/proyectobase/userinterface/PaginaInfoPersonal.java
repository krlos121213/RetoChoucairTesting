package co.com.choucair.certification.proyectobase.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaInfoPersonal {

    public static final Target NOMBRE = Target.the("Primer Nombre").located(By.id("firstName"));

    public static final Target APELLIDO = Target.the("Apellido").located(By.id("lastName"));

    public static final Target EMAIL = Target.the("EMAIL").located(By.id("email"));

    public static final Target MES_NACIMIENTO = Target.the("MES_NACIMIENTO")
            .located(By.id("birthMonth"));

    public static final Target DIA_NACIMIENTO = Target.the("DIA_NACIMIENTO")
            .located(By.id("birthDay"));

    public static final Target ANO_NACIMIENTO = Target.the("ANO_NACIMIENTO")
            .located(By.id("birthYear"));

    public static Target BOTON_UBICACION = Target.the("Boton que lleva a la seccion direccion")
            .located(By.xpath("//a[@class='btn btn-blue']"));
}
