import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Teste {
	
	Elementos menu = new Elementos ();
	
	@Given("^Que eu acesse o site da Audi Teste$")
	public void que_eu_acesse_o_site_da_Audi_Teste() throws Throwable {
		menu.site();
	    
	}

	@When("^Quando eu clicar nos menus$")
	public void quando_eu_clicar_nos_menus() throws Throwable {
		menu.popup();
		menu.quemSomos();
		menu.espera();
		menu.testesAutomatizados();
		menu.espera();
		menu.casesDeSucesso();
		menu.espera();
		menu.trabalheconosco("Douglas Ferreira", "Doug.df@outlook.com", "11995085638", "Rua João Pires dos Santos, 208  Vila Aluminio", "Araçariguama", "Junior", "Analista de Testes", "Estou em busca de novos desafios");
			   
	}

	@Then("^A pagina acessada sera validada$")
	public void a_pagina_acessada_sera_validada() throws Throwable {
		menu.validar();
		menu.espera();
		menu.fechar();
		
	}

}
