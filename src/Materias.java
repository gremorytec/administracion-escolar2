public class Materia {

    //Atributos
    private String nombre;
    private static Materia[] materias = new Materia[10];
    private static int materiaIndex = 0;


    public Materia(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static void agregarMateria(String nombre) {
        if (materiaIndex < materias.length) {
            materias[materiaIndex++] = new Materia(nombre);
            System.out.println("Materia agregada correctamente.");
        } else {
            System.out.println("No se pueden agregar más materias.");
        }
    }

    public static void mostrarMaterias() {
        System.out.println("\nMaterias:");
        for (Materia materia : materias) {
            if (materia != null) {
                System.out.println(materia);
            }
        }
    }

    @Override
    public String toString() {
        return "Materia: " + nombre;
    }

}