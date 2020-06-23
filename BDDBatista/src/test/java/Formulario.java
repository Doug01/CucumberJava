import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class Formulario {
	
	BDDBatistaPage cadastro = new BDDBatistaPage();
	
	@Dado("^que eu esteja no site do batista$")
	public void que_eu_esteja_no_site_do_batista() throws Throwable {
		cadastro.site();
	
	}

	@Quando("^quando eu clico no formulario$")
	public void quando_eu_clico_no_formulario() throws Throwable {
		cadastro.formulario();
		
	    
	}

	@Quando("^criar usuario$")
	public void criar_usuario() throws Throwable {
		cadastro.criar();
	  
	}

	@Quando("^preencho meus dados$")
	public void preencho_meus_dados() throws Throwable {
		cadastro.nome("Douglas");
		cadastro.sobrenome("Ferreira");
		cadastro.email("Doug.df@outlook.com");
		cadastro.endereco("Rua Joao Pires dos Santos");
		cadastro.faculdade("E2E Treinamentos");
		cadastro.profissao("QA Agil");
		cadastro.genero("Masculino");
		cadastro.idade("29");
	  
	}

	@Quando("^clico em criar$")
	public void clico_em_criar() throws Throwable {
		cadastro.confirmar();
	   
	}

	@Entao("^meu usuario foi criado com sucesso$")
	public void meu_usuario_foi_criado_com_sucesso() throws Throwable {
		cadastro.ok();
		
		
		
	  
	}



}
