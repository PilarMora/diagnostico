import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Node list = new Node();
        int option = 0;
        do {
            System.out.println("\nMENU...");
            System.out.println("1. Agregar elemento.");
            System.out.println("2. Eliminar elemento.");
            System.out.println("3. Mostrar lista.");
            System.out.println("0. Salir.");
            System.out.print("Ingrese una opcion: ");
            option = Integer.parseInt(in.nextLine());
            switch(option) {
                case 1:
                    System.out.print("Ingresa un dato: ");
                    int data = Integer.parseInt(in.nextLine());
                    list.addElement(data);
                    break;
                case 2:
                    list.deleteElement();
                    break;
                case 3: 
                    list.showList();
                    break;
                case 0:  
                    System.out.println("\tAdios...");
                    System.exit(0);
                    break;
                default:
                    System.err.println("\n\tOpción no válida.");
            }
        } while (option != 0);
        in.close();
    }
}
