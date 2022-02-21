// 1 - pacote
package TreinamentoSelenium;

// 2 - bobliotecas

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

// 3 - Classes
public class AppTest2 {
    // 3.1 - Atributos

    // 3.2 - Funçoes e Metodos
    @Test //teste navegador "Hello Word"
    public void helloWorld() {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://google.com");
        driver.manage().window().maximize(); //maximiniza a janela aberta
        Assert.assertEquals("Google", driver.getTitle());
        driver.getTitle();
        driver.getCurrentUrl();
        driver.getPageSource();
        driver.close();

    }
}
