import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú de Administración Escolar:");
            System.out.println("1. Agregar Materia");
            System.out.println("2. Agregar Catedrático");
            System.out.println("3. Agregar Grupo");
            System.out.println("4. Agregar Especialidad");
            System.out.println("5. Agregar Alumno");
            System.out.println("6. Mostrar Todos los Datos");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar buffer
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre de la Materia: ");
                    Materia.agregarMateria(scanner.nextLine());
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del Catedrático: ");
                    Catedratico.agregarCatedratico(scanner.nextLine());
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del Grupo: ");
                    Grupo.agregarGrupo(scanner.nextLine());
                    break;
                case 4:
                    System.out.print("Ingrese el nombre de la Especialidad: ");
                    Especialidad.agregarEspecialidad(scanner.nextLine());
                    break;
                case 5:
                    System.out.print("Ingrese el nombre del Alumno: ");
                    Alumno.agregarAlumno(scanner.nextLine());
                    break;
                case 6:
                    Materia.mostrarMaterias();
                    Catedratico.mostrarCatedraticos();
                    Grupo.mostrarGrupos();
                    Especialidad.mostrarEspecialidades();
                    Alumno.mostrarAlumnos();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
    }
}