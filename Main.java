import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArbolInventario inventario = new ArbolInventario();
        int opcion = -1; // <-- Variable declarada aquí

        do {
            System.out.println("\n=================================");
            System.out.println("   SISTEMA DE INVENTARIO TREE-STOCK");
            System.out.println("=================================");
            System.out.println("1. Registrar Producto");
            System.out.println("2. Mostrar Inventario (Inorden)");
            System.out.println("3. Buscar Producto");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());

                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese ID del producto: ");
                        int id = Integer.parseInt(scanner.nextLine());
                        System.out.print("Ingrese nombre del producto: ");
                        String nombre = scanner.nextLine();
                        inventario.insertar(id, nombre);
                        System.out.println("-> Producto insertado con exito.");
                        break;

                    case 2:
                        System.out.println("\n--- LISTADO DE INVENTARIO ---");
                        inventario.mostrarInorden();
                        break;

                    case 3:
                        System.out.print("Ingrese el ID a buscar: ");
                        int idBuscar = Integer.parseInt(scanner.nextLine());
                        inventario.buscar(idBuscar);
                        break;

                    case 0:
                        System.out.println("Saliendo del sistema...");
                        break;

                    default:
                        System.out.println("Opcion invalida. Intente de nuevo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un numero entero valido.");
            }

        } while (opcion != 0);

        scanner.close();
    }
}