package base;

public class Usuario {

	private String nombreDeUsuario;
	private String dispositivo;
	private String contrase�a;
	
	public Usuario(String nombreDeUsuario, String dispositivo, String contrase�a) {
		this.nombreDeUsuario= nombreDeUsuario;
		this.dispositivo = dispositivo;
		this.contrase�a = contrase�a;
	}
	

	public String getNombreDeUsuario() {
		return nombreDeUsuario;
	}
	
	public String getDispositivo() {
		return dispositivo;
	}
	
	public String getContrase�a() {
		return contrase�a;
	}
	
	public String iniciarSesion(Usuario usuario) {
		
		if (usuario.getNombreDeUsuario().equalsIgnoreCase("Gaston") && 
				usuario.getContrase�a().equalsIgnoreCase("hayqueAprobar23")) {
				
				return ("Has iniciado sesion con exito");
			} else {
				return("Datos incorrectos, vuelve a intentarlo");
			}

	}
	
	
	
	
	
	
	
	
	
}
