package stepsPO;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.HomePage;
import pages.ReservePage;
import pages.Base;

public class ComprarPassagemPO {

    // Atributos - Ponto Final / Estação Final / Terminal

    final WebDriver driver; // webdriver não pode ser mais modificado
    // Selenium só pode usar e devolver
    private HomePage homePage; // Só eu posso usar a Home- 1 - Declarar
    private ReservePage reservePage; // Só eu posso usar a Reserve

    public String origem;
    public String destino;

    // Construtor
    public ComprarPassagemPO(Base base) { // classe Base - package pages
        this.driver = base.driver;
    }

    // No arquivo ComprarPassagemPO.java não terá as anotações Before e After
    // Como o projeto é maior e com isso, vai ter uma divisão maior
    // As anotações Before e After devem ficar no arquivo Hooks.java
    // se apenas um arquivo vai usar as anotações Before e After
    // essas anotações podem ficar nesse arquivo ComprarPassagemPO.java
    // caso contrario se essas anotações serão usadas por 2 ou mais arquivos
    // essas anotações devem ficar em um outro arquivo separado - arquivo Hooks.java

    @Dado("que acesso o site {string} PO")
    public void que_acesso_o_site_po(String url) {
        homePage = new HomePage(driver); // driver do Selenium que o construtor trouxe da classe Base
        // 2 - instanciar
        homePage.acessarHomePage(url); // 3 - usar
        // validar se abriu a página correta através do nome da guia
        assertEquals("BlazeDemo", homePage.lerNomeDaGuia());
    }

    @Quando("seleciono a {string} e {string} PO")
    public void seleciono_a_e_po(String origem, String destino) {
        this.origem = origem;
        this.destino = destino;
        homePage.selecionarOrigemDestino(origem, destino);

        // Ativar a sincronização para o robô executar devagar
        // E podermos visualizar o funcionamento
        // Importante: É só como curiosidade ou em caso de problemas
        // O indicado é deixar o robô executar o mais rápido possível

        synchronized (driver) {
            // objeto que deve ser sincronizado - driver do Selenium
            try {
                driver.wait(1000); // Selenium vai esperar por 5 segundos
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @E("clico no botao Find Flights PO")
    public void clico_no_botao_find_flights_po() {
        homePage.clicarbotaoFindFlights();
        // chama a página seguinte --> Reserve
        reservePage = new ReservePage(driver);
        // apos clicar no botao FindFlights muda de página
        // abre a pagina do Reserve - reserva de passagens - classe ReservePage
    }

    @Entao("visualiza a lista de voos PO")
    public void visualiza_a_lista_de_voos_po() {
        assertEquals("BlazeDemo - reserve", reservePage.lerNomeDaGuia());
        assertEquals("Flights from " + this.origem + " to " + this.destino + ":",
                reservePage.lerCabecalhoVoos());

        synchronized (driver) {
            // objeto que deve ser sincronizado - driver do Selenium
            try {
                driver.wait(1000); // Selenium vai esperar por 5 segundos na página
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Quando("clico no {int} PO")
    public void clico_no_po(Integer ordem_do_voo) {
        reservePage.clicarNoVoo(ordem_do_voo);

        synchronized (driver) {
            try {
                driver.wait(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
