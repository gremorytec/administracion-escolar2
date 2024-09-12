public class Especialidad {
    String nombre;

    Especialidad(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        return nombre; // O lo que consideres que debe devolver como String
    }
}