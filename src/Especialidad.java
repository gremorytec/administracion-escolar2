public class Especialidad {
    private String nombre;
    private static Especialidad[] especialidades = new Especialidad[10];
    private static int especialidadIndex = 0;

    public Especialidad(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static void agregarEspecialidad(String nombre) {
        if (especialidadIndex < especialidades.length) {
            especialidades[especialidadIndex++] = new Especialidad(nombre);
            System.out.println("Especialidad agregada correctamente.");
        } else {
            System.out.println("No se pueden agregar más especialidades.");
        }
    }

    public static void mostrarEspecialidades() {
        System.out.println("\nEspecialidades:");
        for (Especialidad especialidad : especialidades) {
            if (especialidad != null) {
                System.out.println(especialidad);
            }
        }
    }

    @Override
    public String toString() {
        return "Especialidad: " + nombre;
    }
}