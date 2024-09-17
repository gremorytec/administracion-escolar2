public class Grupo {
    private String nombre;
    private static Grupo[] grupos = new Grupo[10];
    private static int grupoIndex = 0;

    public Grupo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static void agregarGrupo(String nombre) {
        if (grupoIndex < grupos.length) {
            grupos[grupoIndex++] = new Grupo(nombre);
            System.out.println("Grupo agregado correctamente.");
        } else {
            System.out.println("No se pueden agregar más grupos.");
        }
    }

    public static void mostrarGrupos() {
        System.out.println("\nGrupos:");
        for (Grupo grupo : grupos) {
            if (grupo != null) {
                System.out.println(grupo);
            }
        }
    }

    @Override
    public String toString() {
        return "Grupo: " + nombre;
    }
}