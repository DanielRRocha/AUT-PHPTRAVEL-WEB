package curso.treinamento.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import curso.treinamento.utils.Helper;

public class LoginPage {

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "email")
	private WebElement campoEmail;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement campoPassword;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement botaoLogin;

	@FindBy(xpath = "//div[@class='alert alert-danger loading wow fadeIn animated animated']")
	private WebElement txtEmailinvalido;

	public Boolean validar_tela_login() {
		Helper.aguardar_elemento(10, botaoLogin);
		return botaoLogin.isDisplayed();
	}

	public void preencher_email(String email) {
		campoEmail.sendKeys(email);
	}

	public void preencher_password(String password) {
		campoPassword.sendKeys(password);
	}

	public void clicar_botao_login() {
		botaoLogin.click();
	}

	public Boolean validar_login_invalido(String emailInvalido) throws InterruptedException {
		Helper.aguardar_elemento(10, txtEmailinvalido);
		return emailInvalido.equals(txtEmailinvalido.getText());
	}
	
//	public Boolean validar_login_invalido(String emailInvalido) throws InterruptedException {
//		Helper.aguardar_elemento(10, txtEmailinvalido);
//		String emailInvalido1 = txtEmailinvalido.getText();
//		if(emailInvalido1.equals(emailInvalido)) {
//			return true;
//		}else {
//			return false;
//		}
//	}

}
