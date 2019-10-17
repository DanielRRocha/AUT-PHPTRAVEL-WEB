package curso.treinamento.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import curso.treinamento.pages.AddAdminPage;
import curso.treinamento.pages.AdminsManagementPage;
import curso.treinamento.pages.MenuPage;
import curso.treinamento.setup.Hooks;
import curso.treinamento.utils.Helper;
import io.cucumber.datatable.DataTable;

public class AdminsManagementSteps {
	
	MenuPage 				menuPage				=	new MenuPage(Hooks.getDriver());
	AdminsManagementPage	adminsManagementPage	=	new AdminsManagementPage(Hooks.getDriver());
	AddAdminPage 			addAdminPage			=	new AddAdminPage(Hooks.getDriver());

	@Dado("que eu esteja na tela Adimins Management")
	public void que_eu_esteja_na_tela_Adimins_Management() {
		menuPage.clicar_submenu("ACCOUNTS", "Admins");
		Assert.assertTrue("Pagina Admins Management não apresentada", adminsManagementPage.validar_pagina());
		
	}

	@Quando("cadastro novo administrador")
	public void cadastro_novo_administrador(DataTable dataTable_) {
		adminsManagementPage.clicar_btn_add();
		Assert.assertTrue("Pagina Add Admins não apresentada", addAdminPage.validar_pagina());
		
		addAdminPage.clicar_fechar_need_help();
		
		Helper.create_datatable(dataTable_);

		addAdminPage.preencher_first_name(Helper.dataTable.get(0).get("First Name"));
		addAdminPage.preencher_last_name(Helper.dataTable.get(0).get("Last Name"));
		addAdminPage.preencher_email(Helper.dataTable.get(0).get("Email"));
		addAdminPage.preencher_password(Helper.dataTable.get(0).get("Password"));
		addAdminPage.preencher_mobile(Helper.dataTable.get(0).get("Mobile Number"));
		addAdminPage.selecionar_country(Helper.dataTable.get(0).get("Country"));
		addAdminPage.preencher_address1(Helper.dataTable.get(0).get("Address 1"));
		addAdminPage.preencher_address2(Helper.dataTable.get(0).get("Address 2"));
		addAdminPage.selecionar_status(Helper.dataTable.get(0).get("Status"));
		addAdminPage.selecionar_add(Helper.dataTable.get(0).get("Add"));
		addAdminPage.selecionar_edit(Helper.dataTable.get(0).get("Edit"));
		addAdminPage.selecionar_remove(Helper.dataTable.get(0).get("Remove"));
		addAdminPage.clicar_submit();
		
	}

	@Então("administrador cadastrado com sucesso")
	public void administrador_cadastrado_com_sucesso() {
		Assert.assertTrue("Pagina Add Admins não apresentada", adminsManagementPage.validar_email_na_tabela(Helper.dataTable.get(0).get("Email")));
	}
	
	@Quando("incluo um administrador com os valores: {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
	public void incluo_um_administrador_com_os_valores(String firstName, String lastName, String email, String password, String mobileName, String country, 
			String address1, String address2, String status, String add, String edit, String remove) {
		adminsManagementPage.clicar_btn_add();
		Assert.assertTrue("Pagina Add Admins não apresentada", addAdminPage.validar_pagina());
		
		addAdminPage.clicar_fechar_need_help();

		addAdminPage.preencher_first_name(firstName);
		addAdminPage.preencher_last_name(lastName);
		addAdminPage.preencher_email(email);
		addAdminPage.preencher_password(password);
		addAdminPage.preencher_mobile(mobileName);
		addAdminPage.selecionar_country(country);
		addAdminPage.preencher_address1(address1);
		addAdminPage.preencher_address2(address2);
		addAdminPage.selecionar_status(status);
		addAdminPage.selecionar_add(add);
		addAdminPage.selecionar_edit(edit);
		addAdminPage.selecionar_remove(remove);
		addAdminPage.clicar_submit();
	}

	@Então("administrador {string} cadastrado com sucesso")
	public void administrador_cadastrado_com_sucesso(String email) {
	    
		Assert.assertTrue("Pagina Add Admins não apresentada", adminsManagementPage.validar_email_na_tabela(email));
	}
}
