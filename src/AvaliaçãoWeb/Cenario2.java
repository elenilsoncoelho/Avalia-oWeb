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

public class Cenario2 {
	private WebDriver navegar;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		navegar = new ChromeDriver();
		navegar.get("https://www.amazon.com.br/");

	}

	@After
	public void tearDown() throws Exception {
		// navegar.quit();

	}

	@Test
	public void test() {

	

		navegar.get("https://www.amazon.com.br/ref=nav_logo");

		navegar.findElement(By.xpath("//*[@class='nav-a nav-a-2   nav-progressive-attribute']")).click();
		
		
		 WebElement email = navegar.findElement(By.id("ap_email"));
	        email.sendKeys("elenilson100.coelho@outlook.com");
	      
	        email.submit();
	        
	        WebElement senha = navegar.findElement(By.id("ap_password"));
	        senha.sendKeys("flauta2015@");
	        
	        senha.submit();
	

		WebElement botao = navegar.findElement(By.xpath("//*[@id='nav-hamburger-menu']"));
		botao.click();

		WebDriverWait wait = new WebDriverWait(navegar, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='hmenu-content']/ul[1]/li[31]/a")));

		navegar.findElement(By.xpath("//*[@id='hmenu-content']/ul[1]/li[31]/a")).click();

		WebElement FacaLogin = navegar.findElement(By.xpath("//*[@class='a-spacing-small']"));
		assertTrue(FacaLogin.getText().equals("Fazer login"));

	}
}
