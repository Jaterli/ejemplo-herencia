public class Main {
    public static void main(String[] args) {
        // Crear un objeto de la clase Alumno
        Alumno alumno = new Alumno("Juan Pérez", 20, "A123456");

        // Nostrar el nombre
        System.out.println("Nombre: " + alumno.getNombre());
        // Nostrar la edad
        System.out.println("Edad: " + alumno.getEdad());

        // Cambiar el nombre
        alumno.setNombre("Federico García");
        // Cambiar la edad
        alumno.setEdad(36);

        // Mostrar la información completa del alumno
        System.out.println("\n --- Información completa del alumno ---");
        alumno.mostrarInformacion();
    }
}
