# language: pt
@mobile
Funcionalidade: Login no aplicativo mobile

  Cenário: Realizar login com dados válidos
    Dado que o usuário está na tela de login do app
    Quando o usuário preenche o nome de usuário "standard_user"
    E preenche a senha "secret_sauce"
    E toca no botão de login
    Então o login deve ser realizado com sucesso