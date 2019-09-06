# language : pt
Funcionalidade: Login

  Cenário: Realizar login com sucesso
    Dado Que eu deseje logar no sistema
    Quando Faço login com o usuario "admin@phptravels.com" e senha "demoadmin"
    Então Sou autenticado com sucesso

  Cenário: Tentativa de Login com email inválido
    Dado Que eu deseje logar no sistema
    Quando Faço login com o usuario "teste" e senha "demoadmin"
    Então é apresentada a mensagem "The Email field must contain a valid email address."
    
