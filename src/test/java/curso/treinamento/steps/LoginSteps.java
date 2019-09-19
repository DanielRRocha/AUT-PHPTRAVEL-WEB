package curso.treinamento.steps;

import org.junit.Assert;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import curso.treinamento.pages.HomePage;
import curso.treinamento.pages.LoginPage;
import curso.treinamento.setup.Hooks;

public class LoginSteps {

	private LoginPage loginPage = new LoginPage(Hooks.getDriver());
	private HomePage homePage = new HomePage(Hooks.getDriver());

	@Dado("Que eu esteja na tela de login")
	public void que_eu_deseje_logar_no_sistema() throws InterruptedException {
		
		Assert.assertTrue("Pagina Login não foi encontrada", loginPage.validar_tela_login());

	}

	@Quando("Faço login com o usuario {string} e senha {string}")
	public void faco_login_com_o_usuario_e_senha(String user, String pass) {
		loginPage.preencher_email(user);
		loginPage.preencher_password(pass);
		loginPage.clicar_botao_login();
	}

	@Então("Sou autenticado com sucesso")
	public void sou_autenticado_com_sucesso() throws InterruptedException {
		
		Assert.assertTrue("Pagina Home não encontrada", homePage.validar_pagina());
	}

	@Então("é apresentada a mensagem {string}")
	public void e_apresentada_a_mensagem(String emailInvalido) throws InterruptedException {
		loginPage.validar_login_invalido(emailInvalido);
	}

}
