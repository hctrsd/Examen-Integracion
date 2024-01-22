package clinica;

public class Agenda {
    private int id;
    private int idMascota;
    private String rutDueño;
    private String nombreMascota;
    private String hora;
    private String fecha;

    public Agenda(int id, int idMascota, String rutDueño, String nombreMascota, String hora, String fecha) {
        this.id = id;
        this.idMascota = idMascota;
        this.rutDueño = rutDueño;
        this.nombreMascota = nombreMascota;
        this.hora = hora;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public static void main(String[] args) {
        // Ejemplo de uso de la clase Agenda
        Agenda agenda = new Agenda(1, 1, "123456789", "Max", "10:00", "2024-01-16");

        System.out.println("ID: " + agenda.getId());
        System.out.println("ID Mascota: " + agenda.getIdMascota());
        System.out.println("Rut Dueño: " + agenda.getRutDueño());
        System.out.println("Nombre Mascota: " + agenda.getNombreMascota());
        System.out.println("Hora: " + agenda.getHora());
        System.out.println("Fecha: " + agenda.getFecha());
    }
}

