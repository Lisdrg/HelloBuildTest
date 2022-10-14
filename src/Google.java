import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Invitado1\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("pinguino");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		System.out.print("Se han encontrado: ");
		System.out.println(driver.findElement(By.id("result-stats")).getText()+"para la busqueda 'pinguino'");
		
		driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys("fghgjhjhkkkl...");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		System.out.print("No se han encontrado resultados para la busqueda 'fghgjhjhkkkl...': ");
		System.out.println(driver.findElement(By.id("result-stats")).getText());
	}

}
