import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BDDBatistaPage {
	WebDriver driver;
	
	public void site () {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automacaocombatista.herokuapp.com/treinamento/home");
	}
	
	public void formulario () throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[1]/a")).click();
		Thread.sleep(1000);
	}
	
	public void criar () {
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[1]/div/ul/li[1]/a")).click();
		
	}
	
	public void nome (String nome) {
		driver.findElement(By.id("user_name")).sendKeys(nome);
	}
		public void sobrenome (String sobrenome) {
		driver.findElement(By.id("user_lastname")).sendKeys(sobrenome);
		}		
		public void email (String email) {
		driver.findElement(By.id("user_email")).sendKeys(email);
		}
		public void endereco (String endereco) {
		driver.findElement(By.id("user_address")).sendKeys(endereco);
		}
		public void faculdade (String faculdade) {
		driver.findElement(By.id("user_university")).sendKeys(faculdade);
		}
		public void profissao (String profissao) {
		driver.findElement(By.id("user_profile")).sendKeys(profissao);
		}
		public void genero (String genero) {
		driver.findElement(By.id("user_gender")).sendKeys(genero);
		}
		public void idade (String idade) {
		driver.findElement(By.id("user_age")).sendKeys(idade);
		}
		
	
	
	public void confirmar () throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"new_user\"]/div[5]/div/div/input")).click();
		Thread.sleep(1000);
		
	}
	
	public void ok () {
		assertTrue(driver.findElement(By.id("notice")).getText().contains("Usuário Criado com sucesso"));
		driver.quit();
		
		
	
	}

}
