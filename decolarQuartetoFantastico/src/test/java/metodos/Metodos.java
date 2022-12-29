package metodos;

import org.openqa.selenium.By;

import driver.Drivers;

public class Metodos extends Drivers {
	/**
	 * Metodo para escrever passando o paramento By e String com texto
	 * @param elemento
	 * @param texto
	 */
	public void escrever(By elemento, String texto) {
		try {
			driver.findElement(elemento).sendKeys(texto);
		} catch (Exception e) {
			System.out.println("Erro ao escrever" + elemento);
		}
	}
/**
 * Metodo para clicar passando o parametro By
 * @param elemento
 */
	public void clicar (By elemento) {
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			System.out.println("Erro ao clicar" + elemento);

		}
	}
	
}
