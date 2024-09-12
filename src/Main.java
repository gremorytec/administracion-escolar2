import java.util.Scanner;

public class Main {
    // Declaración de arreglos estáticos
    static Materias[] materias = new Materias[10];
    static Catedratico[] catedraticos = new Catedratico[10];
    static Grupo[] grupos = new Grupo[10];
    static Especialidad[] especialidades = new Especialidad[10];
    static Alumno[] alumnos = new Alumno[10];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú de Administración Escolar");
            System.out.println("1. Agregar Materia");
            System.out.println("2. Agregar Catedrático");
            System.out.println("3. Agregar Grupo");
            System.out.println("4. Agregar Especialidad");
            System.out.println("5. Agregar Alumno");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    agregarMateria();
                    break;
                case 2:
                    agregarCatedratico();
                    break;
                case 3:
                    agregarGrupo();
                    break;
                case 4:
                    agregarEspecialidad();
                    break;
                case 5:
                    agregarAlumno();
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 6);

        scanner.close();
    }

    static void agregarMateria() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre de la Materia: ");
        String nombre = scanner.nextLine();
        System.out.print("Código de la Materia: ");
        String codigo = scanner.nextLine();

        for (int i = 0; i < materias.length; i++) {
            if (materias[i] == null) {
                materias[i] = new Materias(nombre, codigo);
                System.out.println("Materia agregada exitosamente.");
                break;
            }
        }
    }

    static void agregarCatedratico() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre del Catedrático: ");
        String nombre = scanner.nextLine();
        System.out.print("ID del Catedrático: ");
        String id = scanner.nextLine();

        for (int i = 0; i < catedraticos.length; i++) {
            if (catedraticos[i] == null) {
                catedraticos[i] = new Catedratico(nombre, id);
                System.out.println("Catedrático agregado exitosamente.");
                break;
            }
        }
    }

    static void agregarGrupo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Código del Grupo: ");
        String codigo = scanner.nextLine();

        System.out.println("Seleccione la Materia:");
        for (int i = 0; i < materias.length; i++) {
            if (materias[i] != null) {
                System.out.println((i + 1) + ". " + materias[i].nombre);
            }
        }
        int seleccion = scanner.nextInt();
        Materias materia = materias[seleccion - 1];

        for (int i = 0; i < grupos.length; i++) {
            if (grupos[i] == null) {
                grupos[i] = new Grupo(codigo, materia.toString());
                System.out.println("Grupo agregado exitosamente.");
                break;
            }
        }
    }

    static void agregarEspecialidad() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre de la Especialidad: ");
        String nombre = scanner.nextLine();

        for (int i = 0; i < especialidades.length; i++) {
            if (especialidades[i] == null) {
                especialidades[i] = new Especialidad(nombre);
                System.out.println("Especialidad agregada exitosamente.");
                break;
            }
        }
    }

    static void agregarAlumno() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre del Alumno: ");
        String nombre = scanner.nextLine();
        System.out.print("Matrícula del Alumno: ");
        String matricula = scanner.nextLine();

        System.out.println("Seleccione la Especialidad:");
        for (int i = 0; i < especialidades.length; i++) {
            if (especialidades[i] != null) {
                System.out.println((i + 1) + ". " + especialidades[i].nombre);
            }
        }
        int seleccion = scanner.nextInt();
        Especialidad especialidad = especialidades[seleccion - 1];

        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i] == null) {
                alumnos[i] = new Alumno(nombre, matricula, especialidad.toString());
                System.out.println("Alumno agregado exitosamente.");
                break;
            }
        }
    }
}