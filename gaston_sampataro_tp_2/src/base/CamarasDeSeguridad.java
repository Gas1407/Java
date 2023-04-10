package base;

import java.util.ArrayList;

import javax.swing.JOptionPane;


public class CamarasDeSeguridad {

	private static Object Arraylist;
	private String ubicacionCamarasSeguridad;
	private String modoCamarasSeguridad;
	
	
	public CamarasDeSeguridad(String ubicacion, String modoCamarasSeguridad) {
		this.ubicacionCamarasSeguridad = ubicacion;
		this.modoCamarasSeguridad = modoCamarasSeguridad;
	}
	
	public void cambiarModoCamarasSeguridad() {
		
	}
	
	public void cambiarVista(int numeroDeCamara, Usuario usuario) {
		ArrayList<String> ubicacionDeLasCamaras = new ArrayList <String>();
		
		ubicacionDeLasCamaras.add(0, "Puerta de entrada");
		ubicacionDeLasCamaras.add(1, "Patio");
		ubicacionDeLasCamaras.add(2, "Living");
		ubicacionDeLasCamaras.add(3, "Comedor");
		
		JOptionPane.showMessageDialog(null, "Hola " + usuario.getNombreDeUsuario() + " accediste a las camaras de Seguridad");
	
		
		for (int i=0; i < ubicacionDeLasCamaras.size(); i++) {
		
			JOptionPane.showInputDialog("Ingresa el numero de camara");
			JOptionPane.showMessageDialog(null, "Mostrando la camara que da a: " + ubicacionDeLasCamaras.get(i));
			
		}
			
	}
	
	
	public void enviarAlertaAlarma() {
		
	}
	
	
	//getters
	
	public void getUbicacionCamarasSeguridad() {
		
	}
	
	public void getModoCamarasSeguridad() {
		
	}
	
	
}
