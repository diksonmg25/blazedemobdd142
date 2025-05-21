package pages;

import org.openqa.selenium.WebDriver;

public class CommonPage { // classe pai

    public WebDriver driver; // bola quando ele recebe o passe 

    // recebe o selenium da classe Base.java

    // construtor - conecta o exterior com o interior da classe
    public CommonPage(WebDriver driver)
    {
        this.driver = driver;
    }

    // ToDo: Vamos colocar funções em comum nas páginas aqui



    
}
