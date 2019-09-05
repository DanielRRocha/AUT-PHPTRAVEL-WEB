package curso.treinamento.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class LoginSteps {
	
	public WebDriver driver;

	@Dado("Que eu deseje logar no sistema")
	public void que_eu_deseje_logar_no_sistema() {
		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/mac/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.phptravels.net/admin");
	}

	@Quando("Faço login com o usuario {string} e senha {string}")
	public void faço_login_com_o_usuario_e_senha(String user, String pass) {
//		(//input[@name='email'])[1]
//		//input[@name='password']
		
		driver.findElement(By.name("email")).sendKeys(user);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Então("Sou autenticado com sucesso")
	public void sou_autenticado_com_sucesso() throws InterruptedException {
		Thread.sleep(3000);
		Assert.assertTrue(driver.findElement(By.xpath("//strong[text()=' Logout']")).isDisplayed());
	}
}
