package base;

import javax.swing.JOptionPane;

public class Horno {
	
	private String modoHorno;
	private int temperaturaHorno;
	private int timer;
	
	public Horno(String modoHorno, int timer, int temperaturaHorno) {
		this.modoHorno= modoHorno;
		this.temperaturaHorno = temperaturaHorno;
		this.timer= timer;
	}
	
	public void cambiarModoHorno () {
		
	}
	
	public void ajustarTemperaturaHorno() {
		
	}
	
	
	public void prenderHorno( boolean estaPrendido, String encenderHorno, Usuario usuario) {
		
		if (estaPrendido = true) {
			
			
			JOptionPane.showMessageDialog(null, "El usuario " + usuario.getNombreDeUsuario() + " esta prendiendo el horno");
			
		} else {
			
					JOptionPane.showInputDialog(null, "El horno esta apagado. ¿Deseas prenderlo?");
				
				if (encenderHorno.equalsIgnoreCase("si")) {
					
					JOptionPane.showMessageDialog(null, "El horno se esta prendiendo");
					
				} else {
					
					JOptionPane.showMessageDialog(null, "El horno va a seguir apagado");
				}	
				
		}
		
		
	}
	
	
	public String apagarHorno(boolean estaPrendido, String encenderHorno, Usuario usuario) {
		 
		if (estaPrendido = true) {
			
			JOptionPane.showInputDialog(null, usuario.getNombreDeUsuario() + " el horno esta prendido. ¿Desea apagarlo?");
			
					if (encenderHorno.equalsIgnoreCase("si")) {
						
						JOptionPane.showMessageDialog(null, "El horno se esta apagando");
					} 
			
		} else {
			
			System.out.println("El horno ya esta apagado");
		}
		return encenderHorno;
		
		
	}
	
	
	
	//getters
	
	public void getModoHorno() {
		
	}
	
	public void getTemperaturaHorno() {
		
	}
	
	public void getTimer() {
		
	}
	
}



