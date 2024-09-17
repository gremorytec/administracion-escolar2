public class Alumno {
    private String nombre;
    private static Alumno[] alumnos = new Alumno[10];
    private static int alumnoIndex = 0;

    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static void agregarAlumno(String nombre) {
        if (alumnoIndex < alumnos.length) {
            alumnos[alumnoIndex++] = new Alumno(nombre);
            System.out.println("Alumno agregado correctamente.");
        } else {
            System.out.println("No se pueden agregar más alumnos.");
        }
    }

    public static void mostrarAlumnos() {
        System.out.println("\nAlumnos:");
        for (Alumno alumno : alumnos) {
            if (alumno != null) {
                System.out.println(alumno);
            }
        }
    }

    @Override
    public String toString() {
        return "Alumno: " + nombre;
    }
}