package WebSite.PageObjects.Menu;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;

public class MenuPage extends MenuMap {

    public void clicarMenu() {
        driver.findElement(MENU).click();
    }

    public void clicarVisaoMissaoValores() {
        driver.findElement(MISSAO_VISAO_VALORES).click();
    }

    public void validarVisaoMissaoValores(){
        String textoElement = driver.findElement(MISSAO).getText();
        Assert.assertThat(textoElement, CoreMatchers.containsString("Missão"));

        String textoElement2 = driver.findElement(VISAO).getText();
        Assert.assertThat(textoElement2, CoreMatchers.containsString("Visão"));

        String textoElement3 = driver.findElement(VALORES).getText();
        Assert.assertThat(textoElement3, CoreMatchers.containsString("Valores"));;
    }
}
