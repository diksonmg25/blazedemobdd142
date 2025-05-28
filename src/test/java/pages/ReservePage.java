package pages;

import org.openqa.selenium.By;
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

    public By byOrder(int ordem_do_voo){
       return By.xpath("//table[@class='table']/tbody/tr[" + ordem_do_voo + "]//input[@type='submit']");
      
       // tbody/tr[2] - pegar o elemento da segunda linha - numero de voo - 234
       // segunda opção para pegar o elemento na página 
       ///html/body/div[2]/table/tbody/tr[2]/td[1]/input
    }

    // ações
    public String lerCabecalhoVoos() {
        return flightsHeader.getText(); // retorna o elemento h3 e o texto dele
    }

    public void clicarNoVoo(int ordem_do_voo) {
        driver.findElement(byOrder(ordem_do_voo)).click();
    }


}

