package AvaliaçãoWeb;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cenario8 {
	private WebDriver navegar;

	@Before
	public void setUp() throws Exception {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		navegar = new ChromeDriver();
		navegar.get("https://www.amazon.com.br/");
	}

	@Test
	public void test() {
		navegar.get("https://www.amazon.com.br/ref=nav_logo");

		//navegar.manage().window().maximize();
		
		WebElement produto3 = navegar.findElement(By.id("twotabsearchtextbox"));
		 produto3.sendKeys("Final Fantasy VII Remake - Edição Padrão - PlayStation 4");
		 produto3.submit();

		 navegar.findElement(By.xpath("//*[@class='s-main-slot s-result-list s-search-results sg-row']/div[2]//img")).click();
		 
		 
		//navegar.findElement(By.xpath("//*[@id='add-to-cart-button']")).click();

		//navegar.findElement(By.id("//*[@id='nav-cart']")).click();

		//*[@class='s-main-slot s-result-list s-search-results sg-row']/div[2]

		

		//navegar.findElement(By.xpath("//*[text()='Final Fantasy VII Remake - Edição Padrão - PlayStation 4']")).click();
		//navegar.findElement(By.xpath("//*[@id='add-to-cart-button']")).click();

		//navegar.findElement(By.xpath("//*[@id='nav-cart']")).click();

		//navegar.findElement(By.xpath("//*[@id='a-autoid-0-announce']")).click();

		// WebElement frete =
		// navegar.findElement(By.xpath("//*[@id='mir-layout-DELIVERY_BLOCK']//span[1]/span[1]']"));
		// assertTrue(frete.getText().equals("Entrega GRÁTIS 20 - 24 de Fevereiro."));

	}

	@After
	public void tearDown() throws Exception {

	}

}
