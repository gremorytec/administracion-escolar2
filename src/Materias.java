public class Materias {
    String nombre;
    String codigo;

    Materias(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }
    @Override
    public String toString() {
        return nombre; // O lo que consideres que debe devolver como String
    }
}
