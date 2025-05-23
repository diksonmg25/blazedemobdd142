package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReservePage extends CommonPage {
    // construtor
    public ReservePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // mapeamento de elementos
    @FindBy(css = "h3")
    WebElement flightsHeader; // chamar o elemento h3 (tag)
    // cabeçalho dos vôos

    // ações
    public String lerCabecalhoVoos() {
        return flightsHeader.getText(); // retorna o elemento h3 e o texto dele
    }

}