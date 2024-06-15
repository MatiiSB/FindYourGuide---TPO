package CLASES;
import java.util.List;

public class Sistema {
	private List<Usuario> usuarios;

    public Sistema(List<Usuario> usuarios) {
        this.usuarios = usuarios;

    }
    
    public void actualizarPerfil(String tipoUsuario, String nombre, String email) {
        for (Usuario usuario : usuarios) {
            if ((usuario instanceof Guia && tipoUsuario.equalsIgnoreCase("Guia")) ||
                (usuario instanceof Turista && tipoUsuario.equalsIgnoreCase("Turista"))) {
                usuario.actualizarPerfil(nombre, email);
                return;
            }
        }
        System.out.println("Usuario no encontrado o tipo de usuario incorrecto.");
    }
    
    
    public static void main(String[] args) {
        ServicioOfrecido servicios = new ArrayList<>();
        ServicioOfrecido servicio1 = new ServicioOfrecido("Tour Guiado", "Tour por la ciudad");
        servicios.add(servicio1);

        List<String> ciudades = new ArrayList<>();
        ciudades.add("Buenos Aires");

        List<String> paises = new ArrayList<>();
        paises.add("Argentina");

        Guia guia = new Guia("Juan", "Perez", "M", "12345678", "juan@example.com", "123456789", ciudades, paises, servicios);
        Turista turista = new Turista("Maria", "Gomez", "F", "87654321", "maria@example.com", "987654321");

        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(guia);
        usuarios.add(turista);

        Sistema sistema = new Sistema(usuarios);

        // Actualizar perfil de un guía
        sistema.actualizarPerfil("Guia", "Carlos", "carlos@example.com");

        // Actualizar perfil de un turista
        sistema.actualizarPerfil("Turista", "Ana", "ana@example.com");
    }
}
