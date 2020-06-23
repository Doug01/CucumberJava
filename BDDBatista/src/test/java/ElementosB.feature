# language: pt
@tag
Funcionalidade: Preencher formulario Batista
  Eu como usuario gostaria de fazer meu cadastro no site do Batista

  @Test1
  Cenario: Elementos basicos Batista
    Dado que eu esteja no site do batista
    Quando quando eu clico no formulario
    E criar usuario
    E preencho meus dados
    E clico em criar
    Entao meu usuario foi criado com sucesso

  