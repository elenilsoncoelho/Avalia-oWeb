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


public class Cenario7 {
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
		
		WebElement produto3 = navegar.findElement(By.id("twotabsearchtextbox"));
        produto3.sendKeys("Final Fantasy VII Remake - Edição Padrão - PlayStation 4");
        produto3.submit();
		
		navegar.findElement(By.xpath("//*[text()='Final Fantasy VII Remake - Edição Padrão - PlayStation 4']")).click();
		navegar.findElement(By.xpath("//*[@id='add-to-cart-button']")).click();
		
		navegar.findElement(By.xpath("//*[@id='nav-cart']")).click();
		
		//navegar.findElement(By.xpath("//*[@id='a-autoid-0-announce']")).click();
		
		
		
		
		
		//WebDriverWait wait = new WebDriverWait(navegar, 10);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("GLUXZipUpdateInput_0")));
	
		//WebElement frete = navegar.findElement(By.xpath("//*[@id='mir-layout-DELIVERY_BLOCK']//span[1]/span[1]']"));
		//assertTrue(frete.getText().equals("Entrega GRÁTIS 20 - 24 de Fevereiro."));
		
    
				//*[@id="add-to-cart-button"]
	}

	
}
