package curso.treinamento.steps;

import org.junit.Assert;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import curso.treinamento.pages.HomePage;
import curso.treinamento.pages.MenuPage;
import curso.treinamento.setup.Hooks;

public class VisualizacaoMenuSteps {
	
	HomePage homePage	=	new HomePage(Hooks.getDriver());
	MenuPage menuPage	=	new MenuPage(Hooks.getDriver());

	@Dado("que eu esteja na tela Home")
	public void que_eu_esteja_na_tela_Home() {
		Assert.assertTrue("Pagina Home não foi Apresentada", homePage.validar_pagina());
	}

	@Quando("acesso o menu {string}")
	public void acesso_o_menu(String menu) {
		menuPage.clicar_menu(menu);
	}

	@Então("são apresentados os itens {string}, {string} e {string} do menu {string}")
	public void são_apresentados_os_itens_e(String subMenuCars, String subMenuExtras, String subMenuCarsSettings, String menu) {
		Assert.assertTrue("Submenu '"+ subMenuCars + "' Não Apresentado", menuPage.validar_menu(menu, subMenuCars));
		Assert.assertTrue("Submenu '"+ subMenuExtras + "' Não Apresentado", menuPage.validar_menu(menu, subMenuExtras));
		Assert.assertTrue("Submenu '"+ subMenuCarsSettings + "' Não Apresentado", menuPage.validar_menu(menu, subMenuCarsSettings));
	}
	
	@Então("são apresentados os itens {string}, {string}, {string} e {string} do menu {string}")
	public void são_apresentados_os_itens(String subMenuAdmins, String subMenuSuppliers,String subMenuCustomers, String subMenuGuestCostumers, String menu) {
		Assert.assertTrue("Submenu '"+ subMenuAdmins + "' Não Apresentado", menuPage.validar_menu(menu, subMenuAdmins));
		Assert.assertTrue("Submenu '"+ subMenuSuppliers + "' Não Apresentado", menuPage.validar_menu(menu, subMenuSuppliers));
		Assert.assertTrue("Submenu '"+ subMenuCustomers + "' Não Apresentado", menuPage.validar_menu(menu, subMenuCustomers));
		Assert.assertTrue("Submenu '"+ subMenuGuestCostumers + "' Não Apresentado", menuPage.validar_menu(menu, subMenuGuestCostumers));
	}
}
