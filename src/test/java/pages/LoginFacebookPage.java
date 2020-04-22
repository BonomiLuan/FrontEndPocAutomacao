package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.OpenWeb;

public class LoginFacebookPage {

	OpenWeb openWeb = new OpenWeb();
	WebDriver webDriver;
	
	public void abrirNavegador(String navegador) {
		webDriver = openWeb.getWebDriver(navegador);
	}

	public void digitarUrl(String url) {
		webDriver.manage().window().maximize();
		webDriver.get(url);
	}

	public void digitarLogin(String usuario) {
		webDriver.findElement(By.id("email")).sendKeys(usuario);
	}

	public void digitarSenha(String senha) {
		webDriver.findElement(By.id("pass")).sendKeys(senha);
	}

	public void selecionarEntrar() {
		webDriver.findElement(By.xpath("//*[@id='u_0_b']")).click();
	}

	public boolean validarLogin() {
		if(webDriver.findElement(By.xpath("//*[@id='u_0_a']/div[1]/div[1]/div/a/span/span")).getText().contains("Luan")) {
			return true;
		}
		return false;
	}
}
