package steps;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import runner.Executa;

public class passeiosdeecolarTest {

	Metodos metodos = new Metodos();
	Elementos el = new Elementos();

	@Given("Que esteja na pagina de passeios")
	public void queEstejaNaPaginaDePasseios() {
		Executa.abrirNavegador();

	}

	@Given("preencher destino valido")
	public void preencherDestinoValido() {
		metodos.clicar(el.pesquisa);
		metodos.escrever(el.pesquisa, "Rio de Janeiro  ");
	}

	@Given("selecionar opcao")
	public void selecionarOpcao() {
		metodos.clicar(el.btnRiodejaneiro);

	}

	@When("Clicar em Buscar")
	public void clicarEmBuscar() {
		metodos.clicar(el.btnBuscar);
	}

	@When("preencher data de entrada e saida")
	public void preencherDataDeEntradaESaida() {
		
	}

	@Given("e clicar em Passeios perto de mim")
	public void eClicarEmPasseiosPertoDeMim() {
		metodos.clicar(el.btnPertodemim);
	}

	@When("preencher datas da viajem")
	public void preencherDatasDaViajem() {
		metodos.clicar(el.btnEntrada);
		metodos.clicar(el.btn21);
		metodos.clicar(el.btn25);
	}

}
