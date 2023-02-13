package AvaliaçãoWeb;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;


public class Cenario3 {
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
		
		WebElement produto = navegar.findElement(By.id("twotabsearchtextbox"));
        produto.sendKeys("bicicleta aro 29");
        produto.submit();
        
        WebElement bike = navegar.findElement(By.xpath("//span[contains(text(), 'Snow Bike 429-05D 21 Marchas Câmbio Traseiro e Freios a Disco Branca')]"));
        assertTrue(bike.getText().equals("Bicicleta Aro 29 Snow Bike 429-05D 21 Marchas Câmbio Traseiro e Freios a Disco Branca"));
         
       
        if (bike !=null) {
        	System.out.println("a bicicleta foi encontrada");
        }else {
        	System.out.println("A bicleta não foi encontrada");
        }

    
     
		
		
		
		
	
		
		
		
	}

	
}
