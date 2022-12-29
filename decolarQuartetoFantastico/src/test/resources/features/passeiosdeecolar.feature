#Author: bruna.cedro@e2etreinamentos.com.br

@buscar
Feature: Busca de Passeios
 Como usuario 
 Quero realizar pesquisa
 Para realizar compra de passeios

Background: Acessar aba de passeios 
 Given Que esteja na pagina de passeios
  
  @buscar1
  Scenario: Buscar com Destino Correto 
   And preencher destino valido
   And selecionar opcao
   When Clicar em Buscar
   And preencher data de entrada e saida 
   Then Sistema habilita opcoes de passeios.
  
  @buscar2
  Scenario Outline: Busca com button Passeios perto de mim
   And e clicar em Passeios perto de mim 
   When Sistema redireciona para outra pagina 
   And preencher datas da viajem 
   Then Entao sistema exibe viagens proximas.
