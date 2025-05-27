package stepsPO;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
//import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Base;

public class Hooks {
    
    Base base; // Base - bola ]

    // Construtor

    public Hooks(Base base){ // funciona como um juiz - da um apito para começar o jogo
        this.base = base;
    }

    @Before
    public void iniciarPO(){
      //WebDriverManager.chromedriver().setup();
      base.driver = new ChromeDriver();
      base.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(60000));       
      base.driver.manage().window().maximize();
    }

    @After
    public void finalizarPO(){
        base.driver.quit();
    }
      
}
