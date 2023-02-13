package AvaliaçãoWeb;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;


public class Cenario4 {
	private WebDriver navegar;
	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		navegar = new ChromeDriver();
		navegar.get("https://www.amazon.com.br/");
	}

	@After
	public void tearDown() throws Exception {
		
	}

	
	@Test
	public void CalculoFrete() {
		navegar.get("https://www.amazon.com.br/ref=nav_logo");
		
		WebElement produto = navegar.findElement(By.id("twotabsearchtextbox"));
        produto.sendKeys("qqqaassdfhrhrhrhhrhgrzhhhhhhhr");
        produto.submit();
        
        WebElement dados = navegar.findElement(By.xpath("//span[contains(text(), 'Nenhum resultado para qqqaassdfhrhrhrhhrhgrzhhhhhhhr.')]"));
        assertTrue(dados.getText().equals(" Nenhum resultado para qqqaassdfhrhrhrhhrhgrzhhhhhhhr."));
   	
	}

	
}
