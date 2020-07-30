#language: pt

Funcionalidade: Home Page
  A Home Page é a página principal do portal da Radix Engenharia

  Cenário: CT01 - Validar acesso ao portal Radix Engenharia
    Dado o usuário acessa a Home Page
    Então a página é carregada com sucesso

  Cenário: CT02 - Pesquisar por vagas na barra de busca
    Dado o usuário acessa a Home Page
    Quando preenche a barra de busca por "vagas"
    E clica no ícone de lupa
    Então os resultados de "vagas" são exibidos com sucesso
