import static org.junit.Assert.assertTrue;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elementos {
	
	WebDriver driver;
	
	public void site () {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://auditeste.com.br/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void espera () throws InterruptedException {
		Thread.sleep(3000);
		
	}
	
	public void popup () {
		driver.findElement(By.xpath("//*[@id=\"sgpb-popup-dialog-main-div-wrapper\"]/div/img")).click();
	}
	
	public void quemSomos () {
		driver.findElement(By.xpath("//*[@id=\"menu-item-133\"]/a")).click();
	}
	
	public void testesAutomatizados () {
		driver.findElement(By.xpath("//*[@id=\"menu-item-290\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"menu-item-296\"]/a")).click();
	}
	
	public void casesDeSucesso () {
		driver.findElement(By.xpath("//*[@id=\"menu-item-392\"]/a")).click();
		
	}
	
	public void trabalheconosco (String nome, String email, String telefone, String endereco, String cidade, String objetivo, String area, String mensagem) {
		driver.findElement(By.xpath("//*[@id=\"menu-item-135\"]/a")).click();
		driver.findElement(By.name("nome")).sendKeys(nome);
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("telefone")).sendKeys(telefone);
		driver.findElement(By.name("endereço")).sendKeys(endereco);
		driver.findElement(By.name("escreva_o_nome_da_sua_cidade")).sendKeys(cidade);
		driver.findElement(By.name("objetivo_profissional")).sendKeys(objetivo);
		driver.findElement(By.name("área")).sendKeys(area);
		driver.findElement(By.name("mensagem")).sendKeys(mensagem);
		driver.findElement(By.xpath("//*[@id=\"field_container\"]/div/div/button")).click();
		
	}
	
	public void validar () {
		assertTrue(driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div/div/div/div[2]")).getText().contains("Venha fazer parte da empresa referência em qualidade de software."));
		
	}
	
	public void fechar () {
		driver.quit();
	}

}
