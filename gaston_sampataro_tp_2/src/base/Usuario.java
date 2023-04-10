package base;

public class Usuario {

	private String nombreDeUsuario;
	private String dispositivo;
	private String contraseña;
	
	public Usuario(String nombreDeUsuario, String dispositivo, String contraseña) {
		this.nombreDeUsuario= nombreDeUsuario;
		this.dispositivo = dispositivo;
		this.contraseña = contraseña;
	}
	

	public String getNombreDeUsuario() {
		return nombreDeUsuario;
	}
	
	public String getDispositivo() {
		return dispositivo;
	}
	
	public String getContraseña() {
		return contraseña;
	}
	
	public String iniciarSesion(Usuario usuario) {
		
		if (usuario.getNombreDeUsuario().equalsIgnoreCase("Gaston") && 
				usuario.getContraseña().equalsIgnoreCase("hayqueAprobar23")) {
				
				return ("Has iniciado sesion con exito");
			} else {
				return("Datos incorrectos, vuelve a intentarlo");
			}

	}
	
	
	
	
	
	
	
	
	
}
