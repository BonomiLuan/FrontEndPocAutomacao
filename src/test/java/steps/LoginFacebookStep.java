package steps;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import pages.LoginFacebookPage;

public class LoginFacebookStep {
	
	private String navegador = "chrome";
	private String url = "https://www.facebook.com/";
	private String usuario = "login";
	private String senha = "password";

	@Test
	public void realizarLogin() {
		LoginFacebookPage loginFacebookPage = new LoginFacebookPage();
		
		//Abrir navegador
		loginFacebookPage.abrirNavegador(navegador);
		
		//Digitar a url
		loginFacebookPage.digitarUrl(url);
		
		//digitar o login
		loginFacebookPage.digitarLogin(usuario);
		
		//digitar a senha
		loginFacebookPage.digitarSenha(senha);
		
		//selecionar entrar
		loginFacebookPage.selecionarEntrar();
		
		//validar se entrou
		assertTrue(loginFacebookPage.validarLogin());
	}
	
	
}
