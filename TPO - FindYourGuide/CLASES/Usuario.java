package CLASES;

public class Usuario {
	
	private String Nombre;
	private String Apellido;
	private String Sexo;
	private int DNI;
	private String Email;
	private int Telefono;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void CrearUsuario(String Nombre,String Apellido,String Sexo) {
		
	}
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		this.Apellido = apellido;
	}
	public String getSexo() {
		return Sexo;
	}
	public void setSexo(String sexo) {
		this.Sexo = sexo;
	}
	public int getDNI() {
		return DNI;
	}
	public void setDNI(int dNI) {
		this.DNI = dNI;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		this.Email = email;
	}
	public int getTelefono() {
		return Telefono;
	}
	public void setTelefono(int telefono) {
		this.Telefono = telefono;
	}

}
