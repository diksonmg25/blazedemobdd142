package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonPage { // filho da classe pai CommonPage

    // construtor
    public HomePage(WebDriver driver) {
        super(driver); // driver herdado de CommonPage - super classe

        // parecido com o import - super import

        PageFactory.initElements(driver, this); // liga a classe HomePage com a CommonPage

        // herda a bola do classe pai CommonPage e inicializa a bola
        // coloca a bola em jogo nessa classe de mapeamento de página (HomePage)

    }

    // elementos mapeados
    // mapeamento para os combos origem e destino

    public By byLocal(String local) {
        // ele é um by, um endereço, uma origem ou destino - fromPort ou toPort 

        return By.cssSelector("option[value=\"" + local + "\"]");

    // toda vez que tem um \" a " vai ser ignorada na primeira vez
    // mas, a " vai ser usada na segunda vez
    // fica assim na execução: option]value="Rome"]
    }

    @FindBy(css = ".btn-primary") 
    //@FindBy(css = "input[value]") 
    // procurar pelo botão "Find Flights"
    WebElement btnFindFlights;


    // ações com os elementos mapeados



}
