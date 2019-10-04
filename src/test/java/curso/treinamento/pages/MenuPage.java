package curso.treinamento.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import curso.treinamento.setup.Hooks;
import curso.treinamento.utils.Helper;

public class MenuPage {

	public MenuPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clicar_menu(String menu) {
		Hooks.getDriver().findElement(By.xpath("//a[@href='#"+menu+"']")).click();
	}
	
	public void clicar_submenu(String menu, String subMenu) {
		WebElement subMenu_ = Hooks.getDriver().findElement(By.xpath("//a[@href='#"+menu+"']/following::a[text()='"+subMenu+"']"));
		
		subMenu_.click();
	}
	
public boolean validar_menu(String menu, String subMenu) {
		
		return Helper.elemento_existe(Hooks.getDriver().findElement(By.xpath("//a[@href='#"+menu+"']/following::a[text()='"+subMenu+"']")), 10);
	}

}