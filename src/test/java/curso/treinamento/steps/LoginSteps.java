package curso.treinamento.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import curso.treinamento.pages.LoginPage;
import curso.treinamento.setup.Hooks;

public class LoginSteps {
	
	private LoginPage loginPage = new LoginPage(Hooks.getDriver());
	
		@Dado("Que eu esteja na tela de login")
		public void que_eu_deseje_logar_no_sistema() {
			
			
			//Fazer validação
			
		}
	
		@Quando("Faço login com o usuario {string} e senha {string}")
		public void faco_login_com_o_usuario_e_senha(String user, String pass) {
			loginPage.preencher_email(user);
			loginPage.preencher_password(pass);
			loginPage.clicar_botao_login();
		}
	
		@Então("Sou autenticado com sucesso")
		public void sou_autenticado_com_sucesso() throws InterruptedException {

		}
		
		@Então("é apresentada a mensagem {string}")
		public void e_apresentada_a_mensagem(String emailInvalido) throws InterruptedException {

		}
	
}
