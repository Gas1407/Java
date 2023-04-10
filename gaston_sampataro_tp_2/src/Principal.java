import base.Horno;
import base.Usuario;
import base.AireAcondicionado;
import base.CamarasDeSeguridad;
import base.Heladera;

public class Principal {

	public static void main(String[] args) {
		
		Usuario usuario = new Usuario("Gaston", "Computadora", "hayqueAprobar23");
		Horno electrolux = new Horno("Calentar", 50, 30);
		CamarasDeSeguridad adt = new CamarasDeSeguridad(null, null); 
		AireAcondicionado alaska = new AireAcondicionado(0, "cero");
		Heladera patrick = new Heladera (0, 0, 0);
		
		// Que el usuario pueda prender y apagar el horno
		
		electrolux.prenderHorno(true, "si", usuario);
		
		electrolux.apagarHorno(false, "si", usuario);
		
		
		// Que el usuario pueda acceder a las camaras de seguridad 
		
		adt.cambiarVista(0, usuario);
		
		
		//Que el usuario pueda cambiar el modo del aire acondicionado
		
		alaska.cambiarModoDelAire(usuario);

	}
	
}
