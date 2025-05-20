Funcionalidade: Login na plataforma

  Cenário: Login com credenciais válidas
    Dado que o usuário está na página de login
    Quando ele preenche o usuário "standard_user" e a senha "secret_sauce"
    E clica no botão de login
    Então ele deve ser redirecionado para a página de produtos
