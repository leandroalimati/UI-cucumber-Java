package WebSite.PageObjects.Home;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;

public class HomePage extends HomeMap {

    public void preencherBusca(String palavra) {
        driver.findElement(CAMPO_BUSCA).sendKeys(palavra);
    }

    public void clicarBuscar() {
        driver.findElement(BUSCAR).click();
    }

    public void validarBusca(String palavra){
        String textoElement = driver.findElement(RESULTADO_BUSCA1).getText();
        Assert.assertThat(textoElement, CoreMatchers.containsString(palavra));

        String textoElement2 = driver.findElement(RESULTADO_BUSCA2).getText();
        Assert.assertThat(textoElement2, CoreMatchers.containsString(palavra));

        String textoElement3 = driver.findElement(RESULTADO_BUSCA3).getText();
        Assert.assertThat(textoElement3, CoreMatchers.containsString(palavra));
    }

    public void validarHome(){
        String textoElement = driver.findElement(INDUSTRIAS).getText();
        Assert.assertThat(textoElement, CoreMatchers.containsString("Indústrias"));

        String textoElement2 = driver.findElement(SERVIÇOS).getText();
        Assert.assertThat(textoElement2, CoreMatchers.containsString("Serviços"));
    }
}
