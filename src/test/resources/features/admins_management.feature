#language: pt

Funcionalidade: Visualização de Menu

	Contexto: 
		Dado Que eu esteja na tela de login
    Quando Faço login com o usuario "admin@phptravels.com" e senha "demoadmin"
    Dado que eu esteja na tela Home
		Quando acesso o menu "ACCOUNTS"

	@CadastrarAdministrador
	Cenário: Cadastrar novo Admin
		Dado que eu esteja na tela Adimins Management
		Quando cadastro novo administrador
		| First Name	| Last Name	| Email							| Password	| Mobile Number	| Country	| Address 1		| Address 2	| Status	| Add		| Edit	| Remove 		|
		| Daniel			| Rocha			|	teste@teste.com.br| 12345			| 11912345678		| Brazil	| Rua Jandira	| Casa 2		| Enabled	|	Tours	| Cars	| Locations	|
		Então administrador cadastrado com sucesso
		
	