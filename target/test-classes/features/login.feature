# language : pt
Funcionalidade: Login

	@LoginComSucesso
  Cenário: Realizar login com sucesso
    Dado Que eu esteja na tela de login
    Quando Faço login com o usuario "admin@phptravels.com" e senha "demoadmin"
    Então Sou autenticado com sucesso

	@LoginInvalido
  Cenário: Tentativa de Login com email inválido
    Dado Que eu esteja na tela de login
    Quando Faço login com o usuario "teste" e senha "demoadmin"
    Então é apresentada a mensagem "The Email field must contain a valid email address."
    
