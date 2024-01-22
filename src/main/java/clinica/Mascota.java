package clinica;

public class Mascota {
    private int idMascota;
    private String rutDueño;
    private String tipoMascota;
    private int edad;
    private String nombreMascota;

    public Mascota(int idMascota, String rutDueño, String tipoMascota, int edad, String nombreMascota) {
        this.idMascota = idMascota;
        this.rutDueño = rutDueño;
        this.tipoMascota = tipoMascota;
        this.edad = edad;
        this.nombreMascota = nombreMascota;
    }

    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public String getRutDueño() {
        return rutDueño;
    }

    public void setRutDueño(String rutDueño) {
        this.rutDueño = rutDueño;
    }

    public String getTipoMascota() {
        return tipoMascota;
    }

    public void setTipoMascota(String tipoMascota) {
        this.tipoMascota = tipoMascota;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public static void main(String[] args) {
        // Ejemplo de uso de la clase Mascota
        Mascota mascota = new Mascota(1, "123456789", "Perro", 3, "Max");

        System.out.println("ID Mascota: " + mascota.getIdMascota());
        System.out.println("Rut Dueño: " + mascota.getRutDueño());
        System.out.println("Tipo de Mascota: " + mascota.getTipoMascota());
        System.out.println("Edad: " + mascota.getEdad());
        System.out.println("Nombre de Mascota: " + mascota.getNombreMascota());
    }
}

