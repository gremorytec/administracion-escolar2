public class Catedratico {

    private String nombre;
    private static Catedratico[] catedraticos = new Catedratico[10];
    private static int catedraticoIndex = 0;

    public Catedratico(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static void agregarCatedratico(String nombre) {
        if (catedraticoIndex < catedraticos.length) {
            catedraticos[catedraticoIndex++] = new Catedratico(nombre);
            System.out.println("Catedrático agregado correctamente.");
        } else {
            System.out.println("No se pueden agregar más catedráticos.");
        }
    }

    public static void mostrarCatedraticos() {
        System.out.println("\nCatedráticos:");
        for (Catedratico catedratico : catedraticos) {
            if (catedratico != null) {
                System.out.println(catedratico);
            }
        }
    }

    @Override
    public String toString() {
        return "Catedrático: " + nombre;
    }
}