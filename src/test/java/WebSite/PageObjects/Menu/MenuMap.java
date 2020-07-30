package WebSite.PageObjects.Menu;

import WebSite.Base.Hooks;
import org.openqa.selenium.By;

public class MenuMap extends Hooks {

    public static final By MENU = By.id("menu-button");

    public static final By MISSAO_VISAO_VALORES = By.xpath("//*[@id=\"wrapper\"]/div[1]/div/div[2]/div[1]/div[1]/ul/li[1]/a");

    public static final By MISSAO = By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div[2]/div/h2");

    public static final By VISAO = By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div[3]/div/h2");

    public static final By VALORES = By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div[4]/div/h2");
}
