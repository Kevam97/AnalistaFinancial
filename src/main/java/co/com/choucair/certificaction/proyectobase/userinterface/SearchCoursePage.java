package co.com.choucair.certificaction.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject{
    public static final Target BUTTON_UC =Target.the("Selected la universidad choucair")
            .located(By.xpath("//*[@id='certificaciones']//strong"));
    public static final Target INPUT_COURSE = Target.the("Search the course")
            .located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the("Search the course")
            .located(By.xpath("//*[@id='coursesearch']/fieldset/button"));
    public static final Target SELECT_COURSE = Target.the("Push click for do the action")
            .located(By.xpath("//h4/a[contains(string(),'Patrones')]"));
    public static final Target NAME_COURSE = Target.the("Name course")
            .located(By.xpath("//div/h3/a[contains(string(),'Patrones')]"));
}
