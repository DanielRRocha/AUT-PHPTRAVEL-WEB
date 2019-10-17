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
		| First Name	| Last Name	| Email	 						| Password	| Mobile Number	| Country	| Address 1		| Address 2	| Status	| Add		| Edit	| Remove 		|
		| Dani				| Rocha			|	dan@teste.com.br	| 123456		| 11912345678		| Brazil	| Rua Jandira	| Casa 2		| Enabled	|	Tours	| Cars	| Locations	|
		Então administrador cadastrado com sucesso
		
		
	@IncluirAdministrador
	Esquema do Cenário: Inclusão de Administradores
		Dado que eu esteja na tela Adimins Management
		Quando incluo um administrador com os valores: "<First Name>", "<Last Name>", "<Email>", "<Password>", "<Mobile Number>", "<Country>", "<Address 1>", "<Address 2>", "<Status>", "<Add>", "<Edit>", "<Remove>"
		Então administrador "<Email>" cadastrado com sucesso
		
		Exemplos:
		     | First Name	| Last Name	| Email	 								| Password	| Mobile Number	| Country	| Address 1		| Address 2	| Status	| Add		| Edit	| Remove 		|
				 | Daniel			| Rocha1		|	daniel1@teste.com.br	| 123456		| 11912345678		| Brazil	| Rua Jandira	| Casa 2		| Enabled	|	Tours	| Cars	| Locations	|
				 | Daniel			| Rocha2		|	daniel2@teste.com.br	| 123456		| 11912345678		| Bolivia	| Rua Jandira	| Casa 2		| Enabled	|	Tours	| Cars	| Locations	|
				 | Daniel			| Rocha3		|	daniel3@teste.com.br	| 123456		| 11912345678		| Canada	| Rua Jandira	| Casa 2		| Enabled	|	Tours	| Cars	| Locations	|
	