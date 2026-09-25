/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gestiontareas;
import java.util.Scanner;
/**
 *
 * @author david
 */
public class GestionTareas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaTareas lista = new ListaTareas();
        int opcion = 0;

        System.out.println("Bienvenido a la aplicacion de gestion de tareas :C.");

        while (opcion != 6) {
            System.out.println("\nMenu:");
            System.out.println("1. Agregar nueva tarea");
            System.out.println("2. Eliminar tarea");
            System.out.println("3. Ver lista de tareas");
            System.out.println("4. Marcar tarea como completada");
            System.out.println("5. Eliminar tareas completadas");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la descripcion de la nueva tarea: ");
                    String nuevaDesc = scanner.nextLine();
                    lista.agregarAlPrincipio(nuevaDesc);
                    System.out.println("Nueva tarea agregada al principio de la lista.");
                    break;

                case 2:
                    System.out.print("Ingrese la descripcion de la tarea a eliminar: ");
                    String elimDesc = scanner.nextLine();
                    lista.eliminarTarea(elimDesc);
                    break;

                case 3:
                    System.out.println("Lista de tareas:");
                    lista.imprimirLista();
                    break;

                case 4:
                    System.out.print("Ingrese la descripcion de la tarea a completar: ");
                    String compDesc = scanner.nextLine();
                    lista.marcarComoCompletada(compDesc);
                    break;

                case 5:
                    lista.eliminarCompletadas();
                    System.out.println("Todas las tareas completadas han sido eliminadas.");
                    break;

                case 6:
                    System.out.println("Saliendo de la aplicacion...");
                    break;

                default:
                    System.out.println("Opcion invalida. Intente de nuevo.");
            }
        }
        scanner.close();
    }
}