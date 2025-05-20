package br.com.outseara.steps;

import br.com.outseara.pages.LoginMobilePage;
import br.com.outseara.utils.MobileDriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.*;

public class LoginMobileSteps {

    private LoginMobilePage loginPage;

    @Before("@mobile")
    public void setUp() throws Exception {
        MobileDriverFactory.startApp();
        loginPage = new LoginMobilePage(MobileDriverFactory.getDriver());
    }

    @After("@mobile")
    public void tearDown() {
        MobileDriverFactory.closeApp();
    }

    @Dado("que o usuário está na tela de login do app")
    public void que_usuario_esta_na_tela_de_login_app() {}

    @Quando("o usuário preenche o nome de usuário {string}")
    public void usuario_preenche_nome_usuario(String usuario) {
        loginPage.enterUsername(usuario);
    }

    @E("preenche a senha {string}")
    public void usuario_preenche_senha(String senha) {
        loginPage.enterPassword(senha);
    }

    @E("toca no botão de login")
    public void toca_no_botao_login() {
        loginPage.tapLogin();
    }

    @Entao("o login deve ser realizado com sucesso")
    public void login_realizado_com_sucesso() {
        // Validação a ser implementada
    }
}