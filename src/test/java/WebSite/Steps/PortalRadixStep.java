package WebSite.Steps;

import WebSite.Base.Hooks;
import WebSite.PageObjects.Home.HomePage;
import WebSite.PageObjects.Menu.MenuPage;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class PortalRadixStep extends Hooks {

    HomePage home = new HomePage();
    MenuPage menu = new MenuPage();


    @Dado("^o usuário acessa a Home Page$")
    public void oUsuárioAcessaAHomePage() {
        acessarURLChrome();
    }

    @Então("^a página é carregada com sucesso$")
    public void aPáginaÉCarregadaComSucesso() {
        home.validarHome();
        fecharNavegador();
    }

    @Quando("^preenche a barra de busca por \"([^\"]*)\"$")
    public void preencheABarraDeBuscaPor(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        home.preencherBusca(arg0);
    }

    @E("^clica no ícone de lupa$")
    public void clicaNoÍconeDeLupa() {
        home.clicarBuscar();
    }

    @E("^clica em Menu$")
    public void clicaEmMenu() {
        menu.clicarMenu();
    }

    @E("^clica em Missão, Visão e Valores$")
    public void clicaEmMissãoVisãoEValores() {
        menu.clicarVisaoMissaoValores();
    }

    @Então("^as informações de Missão, Visão e Valores da Radix são exibidos com sucesso$")
    public void asInformaçõesDeMissãoVisãoEValoresDaRadixSãoExibidosComSucesso() {
        menu.validarVisaoMissaoValores();
        fecharNavegador();
    }

    @Então("^os resultados de \"([^\"]*)\" são exibidos com sucesso$")
    public void osResultadosDeSãoExibidosComSucesso(String arg0) throws Throwable {
        home.validarBusca(arg0);
        fecharNavegador();
    }
}
