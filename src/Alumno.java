public class Alumno extends Persona {
    private String numeroMatricula;

    // Constructor
    public Alumno(String nombre, int edad, String numeroMatricula) {
        super(nombre, edad); // Llama al constructor de la clase base (Persona)
        this.numeroMatricula = numeroMatricula;
    }

    // Métodos getters y setters
    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    // Método para mostrar información adicional del alumno
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); // Llama al método de la clase base
        System.out.println("Número de matrícula: " + numeroMatricula);
    }
}
