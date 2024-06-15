package CLASES;

public class Guia extends Usuario {
    private String ciudades;
    private String paises;
    private ServicioOfrecido serviciosOfrecidos;

    public Guia(String nombre, String apellido, String sexo, int dni, String email, int telefono,
                String ciudades, String paises) {
        super(nombre, apellido, sexo, dni, email, telefono);
        this.ciudades = ciudades;
        this.paises = paises;
    }

    public String getCiudades() {
        return ciudades;
    }

    public void setCiudades(String ciudades) {
        this.ciudades = ciudades;
    }

    public String getPaises() {
        return paises;
    }

    public void setPaises(String paises) {
        this.paises = paises;
    }

    public ServicioOfrecido getServiciosOfrecidos() {
        return serviciosOfrecidos;
    }

    public void setServiciosOfrecidos(ServicioOfrecido serviciosOfrecidos) {
        this.serviciosOfrecidos = serviciosOfrecidos;
    }

    @Override
    public void actualizarPerfil(String nombre, String email) {
        this.setNombre(nombre);
        this.setEmail(email);
        System.out.println("Perfil del guía actualizado. Nuevo nombre: " + this.getNombre() + ", Nuevo email: " + this.getEmail());
    }

    public void agregarServicio(ServicioOfrecido servicio) {
        serviciosOfrecidos.add(servicio);
    }

    public void eliminarServicio(ServicioOfrecido servicio) {
        serviciosOfrecidos.remove(servicio);
    }
}