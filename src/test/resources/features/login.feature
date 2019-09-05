# language : pt
Funcionalidade: Login

  Cenário: Realizar login com sucesso
    Dado Que eu deseje logar no sistema
    Quando Faço login com o usuario "admin@phptravels.com" e senha "demoadmin"
    Então Sou autenticado com sucesso

