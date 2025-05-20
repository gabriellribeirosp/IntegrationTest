package br.com.outseara.steps;

import br.com.outseara.pages.LoginPage;
import br.com.outseara.utils.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.*;

import org.openqa.selenium.WebDriver;

public class LoginSteps {
    private WebDriver driver;
    private LoginPage loginPage;

    @Before
    public void setUp() {
        driver = DriverFactory.getDriver();
    }

    @Dado("que o usuário está na página de login")
    public void queUsuarioEstaNaPaginaDeLogin() {
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
    }

    @Quando("ele preenche o usuário {string} e a senha {string}")
    public void preencheUsuarioSenha(String usuario, String senha) {
        loginPage.enterUsername(usuario);
        loginPage.enterPassword(senha);
    }

    @E("clica no botão de login")
    public void clicaNoBotaoDeLogin() {
        loginPage.clickLogin();
    }

    @Então("ele deve ser redirecionado para a página de produtos")
    public void redirecionadoParaPaginaProdutos() {
        assert driver.getCurrentUrl().contains("inventory.html");
    }

    @After
    public void tearDown() {
        DriverFactory.closeDriver();
    }
}
