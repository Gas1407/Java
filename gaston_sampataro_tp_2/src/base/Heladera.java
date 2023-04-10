package base;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Heladera {

	private int temperaturaHeladera;
	private int numeroDeSerie;
	private int tipoDeAlimento;
	
	public Heladera(int temperaturaHeladera, int numeroDeSerie, int tipoDeAlimento) {
		this.temperaturaHeladera = temperaturaHeladera;
		this.numeroDeSerie = numeroDeSerie;
		this.tipoDeAlimento = tipoDeAlimento;
	}
	
	public void cambiarTemperaturaHeladera (Heladera patrick, int temperaturaHeladera, int temperaturaIngresada) {
	
		JOptionPane.showMessageDialog(null, "La heladera esta a " + temperaturaHeladera + "º");
		JOptionPane.showInputDialog("Ingrese la temperatura que desee");
		
		if (temperaturaIngresada>temperaturaHeladera) {
			
			JOptionPane.showMessageDialog(null, "Subiste la temperatura\n La temperatura ingresada es de " + temperaturaIngresada + "º");
		} else if (temperaturaIngresada<temperaturaHeladera) {
			
			JOptionPane.showMessageDialog(null, "Bajaste la temperatura\n La temperatura ingresada es de " + temperaturaIngresada + "º");
		} else {
			
			JOptionPane.showMessageDialog(null, "Error, la temperatura ingresada es la misma");
		}
		
	}
	
	public void avisoDeVencimiento() {
	
	
	}
	
	
	//getters
	
	public void getTemperaturaHeladera() {
		
		
	}
	
	
	public void getNumeroDeSerie() {
		
	}
	
	public void getTipoDeAlimento() {
		
	}
	
	
	
}
