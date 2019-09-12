package curso.treinamento.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	
	@FindBy(xpath = "//strong[text()=' Logout']")
	private WebElement homePage;
	
	@FindBy(xpath = "//div[@class='alert alert-danger loading wow fadeIn animated animated']")
	private WebElement txtEmailinvalido;
	
	
	public void validar_tela_login() throws InterruptedException {
		Thread.sleep(3000);
		
		Assert.assertTrue(campoEmail.isDisplayed());
		Assert.assertTrue(campoPassword.isDisplayed());
		Assert.assertTrue(botaoLogin.isDisplayed());
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
	
	public void validar_login_invalido(String emailInvalido) throws InterruptedException {
		Thread.sleep(3000);
//	Assert.assertTrue(txtEmailinvalido.isDisplayed());
	Assert.assertEquals(emailInvalido, txtEmailinvalido.getText());
	}
	
	public void validar_home() throws InterruptedException {
		Thread.sleep(3000);
		Assert.assertTrue(homePage.isDisplayed());
	}
}
