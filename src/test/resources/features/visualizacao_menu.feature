#language: pt

Funcionalidade: Visualização de Menu

	Contexto: 
		Dado Que eu esteja na tela de login
    Quando Faço login com o usuario "admin@phptravels.com" e senha "demoadmin"

	@Menu
	Cenário: Itens apresentados no menu Cars
		Dado que eu esteja na tela Home
		Quando acesso o menu "Cars"
		Então são apresentados os itens "Cars", "Extras" e "Cars Settings" do menu "Cars"
		
	@Menu
	Cenário: Itens apresentados no menu Accounts
		Dado que eu esteja na tela Home
		Quando acesso o menu "ACCOUNTS"
		Então são apresentados os itens "Admins", "Suppliers", "Customers" e "GuestCustomers" do menu "ACCOUNTS"