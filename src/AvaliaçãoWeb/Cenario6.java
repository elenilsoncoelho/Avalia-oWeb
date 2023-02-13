package AvaliaçãoWeb;



import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Cenario6 {
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
	public void test() {
navegar.get("https://www.amazon.com.br/ref=nav_logo");
		
		WebElement produto2 = navegar.findElement(By.id("twotabsearchtextbox"));
        produto2.sendKeys("frigideira");
        produto2.submit();
		
		navegar.findElement(By.xpath("//span[contains(text(), 'Frigideira Duo 28Cm 2,0 Litros Cobre')]")).click();
		
		navegar.findElement(By.id("contextualIngressPtLabel_deliveryShortLine")).click();
		
		WebDriverWait wait = new WebDriverWait(navegar, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("GLUXZipUpdateInput_0")));
		
		
		navegar.findElement(By.xpath("//*[@id='GLUXZipUpdateInput_0']")).sendKeys("06010067");
		navegar.findElement(By.xpath("//*[@id='GLUXZipUpdate']/span/input")).click();
	
		WebElement frete = navegar.findElement(By.xpath("//*[text()='Entrega GRÁTIS 20 - 24 de Fevereiro']"));
		assertTrue(frete.getText().equals("Entrega GRÁTIS 20 - 24 de Fevereiro."));
		
		
		
		//*[@id="GLUXZipUpdateInput_0"]
	
		
		
		
		
		
	
		
		
		
	}

	
}
