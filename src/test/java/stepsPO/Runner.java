package stepsPO;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) // gatilho para tudo o que foi preparado antes
// porta de entrada para que tudo funcione
@CucumberOptions(
    // serve para mostrar onde está a pasta de features
    features = { "src/test/resources/featuresPO"}, // Caminho para suas features - ComprarPassagemPO.feature
    glue =     { "stepsPO"}, // Caminho para automação - bloco de passos - classe ComprarPassagemPO
    dryRun = false,          // Exibição do log
    monochrome = true        // Detalhes do log quando exibido
)
public class Runner {
    
}
