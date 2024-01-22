package clinica;

public class Usuario {
    private int id;
    private String nombreUsuario;
    private String password;

    public Usuario(int id, String nombreUsuario, String password) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static void main(String[] args) {
        // Ejemplo de uso de la clase Usuario
        Usuario usuario = new Usuario(1, "usuario1", "contraseña123");

        System.out.println("ID: " + usuario.getId());
        System.out.println("Nombre de Usuario: " + usuario.getNombreUsuario());
        System.out.println("Contraseña: " + usuario.getPassword());
    }
}
