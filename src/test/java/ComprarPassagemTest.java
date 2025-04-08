// Generated by Selenium IDE
// 1 - Imports / Dependencias / Apontamento de bibliotecas
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

// 2 - Classe
public class ComprarPassagemTest {
  // executar todos os testes de uma vez - clicar no nome da classe
  // 2.1 - Atributos / Variaveis/ Parametros / Caracteristicas
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;

// 2.2 - Funçoes e Metodos - verbos

// funçao - retorna algo - faz e da um retorno

// metodo - nao retorna nada - so faz e pronto

  @BeforeEach
  public void setUp() {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @AfterEach
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void comprarPassagem() {

    // executar um teste por vez - clicar no nome do teste

    // no caso teste - comprarPassagem

    driver.get("https://blazedemo.com/");
    driver.manage().window().setSize(new Dimension(1382, 736));
    driver.findElement(By.name("fromPort")).click();
    {
      WebElement dropdown = driver.findElement(By.name("fromPort"));
      dropdown.findElement(By.xpath("//option[. = 'São Paolo']")).click();
    }
    driver.findElement(By.name("toPort")).click();
    {
      WebElement dropdown = driver.findElement(By.name("toPort"));
      dropdown.findElement(By.xpath("//option[. = 'New York']")).click();
    }
    driver.findElement(By.cssSelector(".btn-primary")).click();
    driver.findElement(By.cssSelector("tr:nth-child(1) .btn")).click();
    driver.findElement(By.id("inputName")).click();
    driver.findElement(By.cssSelector("body")).click();
    driver.findElement(By.id("inputName")).sendKeys("Carlos");
    driver.findElement(By.id("address")).click();
    driver.findElement(By.id("address")).sendKeys("Rua teste 1");
    driver.findElement(By.id("city")).click();
    driver.findElement(By.id("city")).sendKeys("Uberaba");
    driver.findElement(By.id("state")).click();
    driver.findElement(By.id("state")).sendKeys("MG");
    driver.findElement(By.id("zipCode")).click();
    driver.findElement(By.id("zipCode")).sendKeys("38402784");
    driver.findElement(By.id("creditCardNumber")).click();
    driver.findElement(By.id("creditCardNumber")).sendKeys("44453454567894576");
    driver.findElement(By.id("creditCardYear")).click();
    driver.findElement(By.id("creditCardYear")).sendKeys("2026");
    driver.findElement(By.id("nameOnCard")).click();
    driver.findElement(By.id("nameOnCard")).sendKeys("Carlos");
    driver.findElement(By.cssSelector(".checkbox")).click();
    driver.findElement(By.cssSelector(".btn-primary")).click();
    assertEquals(driver.findElement(By.cssSelector("h1")).getText(), "Thank you for your purchase today!");
    assertEquals(driver.findElement(By.cssSelector("tr:nth-child(3) > td:nth-child(2)")).getText(), "555 USD");    
    }
  
}

