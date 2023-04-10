package base;

import javax.swing.JOptionPane;

public class AireAcondicionado {

	private int temperaturaDelAire;
	private String modoDelAire;
	
	public AireAcondicionado(int temperaturaDelAire, String modoDelAire) {
		this.temperaturaDelAire = temperaturaDelAire;
		this.modoDelAire = modoDelAire;
		
	}
	
	public void cambiarModoDelAire(Usuario usuario) {
		
		JOptionPane.showInputDialog(usuario.getNombreDeUsuario()+ ": " + "Escribi la palabra cero si queres el modo frio o la palabra uno si queres el modo calor");
		
		switch (modoDelAire) {
	
		case "cero": modoDelAire = "frio";
			
					JOptionPane.showMessageDialog (null, "Elegiste el modo FRIO");
		
			break;
		
		case "uno": modoDelAire = "calor"; 
		
					JOptionPane.showMessageDialog (null, "Elegiste el modo CALOR");
		
			break;
		}
	}
	
	public void cambiarTemperaturaDelAire() {
		
	}
	
	public void prenderAire() {
		
	}
	
	public void apagarAire() {
		
	}
	
	//Getters
	
	public void getTemperaturaDelAire() {
		
	}
	
	public void getModoDelAire() {
		
	}
	
	
	
	
	
	
	
	
}
