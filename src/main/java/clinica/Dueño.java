package clinica;

public class Dueño {
    private String rut;
    private String nombre;
    private String apellido;
    private String direccion;
    private String correo;
    private String telefono;
    private String nombreMascota;

    public Dueño(String rut, String nombre, String apellido, String direccion, String correo, String telefono, String nombreMascota) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
        this.nombreMascota = nombreMascota;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public static void main(String[] args) {
        // Ejemplo de uso de la clase Dueño
        Dueño dueño = new Dueño("123456789", "Juan", "Pérez", "Calle Principal 123", "juan@example.com", "123456789", "Max");
        
        System.out.println("Rut: " + dueño.getRut());
        System.out.println("Nombre: " + dueño.getNombre());
        System.out.println("Apellido: " + dueño.getApellido());
        System.out.println("Dirección: " + dueño.getDireccion());
        System.out.println("Correo: " + dueño.getCorreo());
        System.out.println("Teléfono: " + dueño.getTelefono());
        System.out.println("Nombre de Mascota: " + dueño.getNombreMascota());
    }
}

