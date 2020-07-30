package WebSite.PageObjects.Home;

import WebSite.Base.Hooks;
import org.openqa.selenium.By;

public class HomeMap extends Hooks {

    public static final By INDUSTRIAS = By.xpath("//*[@id=\"wrapper\"]/div[2]/div[1]/div/div/h2");

    public static final By SERVIÇOS = By.xpath("//*[@id=\"wrapper\"]/div[2]/div[4]/div/div/h2");

    public static final By CAMPO_BUSCA = By.id("search-field");

    public static final By BUSCAR = By.id("nav-search-icon");

    public static final By RESULTADO_BUSCA1 = By.xpath("//*[@id=\"result-grid\"]/div[1]/div[1]/div/div[2]/div/a");

    public static final By RESULTADO_BUSCA2 = By.xpath("//*[@id=\"result-grid\"]/div[1]/div[2]/div/div[2]/div/a");

    public static final By RESULTADO_BUSCA3 = By.xpath("//*[@id=\"result-grid\"]/div[1]/div[3]/div/div[2]/div/a");
}
