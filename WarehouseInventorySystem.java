import java.util.Scanner;

public class WarehouseInventorySystem {

    static String[] names     = new String[100];
    static int[]    quantity  = new int[100];
    static double[] price     = new double[100];
    static int count = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Sample data
        names[0] = "Steel Bolts";   quantity[0] = 150; price[0] = 12.99; count++;
        names[1] = "Safety Helmets"; quantity[1] = 45; price[1] = 24.50; count++;
        names[2] = "Forklift Battery"; quantity[2] = 8; price[2] = 189.00; count++;

        int choice;
        do {
            System.out.println("\n1. View All\n2. Add Product\n3. Update Quantity\n0. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nID  | Name              | Qty | Price");
                    System.out.println("------------------------------------------");
                    for (int i = 0; i < count; i++) {
                        System.out.printf("%-3d | %-17s | %-3d | $%.2f%n",
                                i + 1, names[i], quantity[i], price[i]);
                    }
                    break;

                case 2:
                    sc.nextLine();
                    System.out.print("Name: ");
                    names[count] = sc.nextLine();
                    System.out.print("Quantity: ");
                    quantity[count] = sc.nextInt();
                    System.out.print("Price: $");
                    price[count] = sc.nextDouble();
                    count++;
                    System.out.println("Product added!");
                    break;

                case 3:
                    System.out.print("Enter ID to update: ");
                    int id = sc.nextInt() - 1;
                    if (id >= 0 && id < count) {
                        System.out.print("New quantity: ");
                        quantity[id] = sc.nextInt();
                        System.out.println("Updated!");
                    } else {
                        System.out.println("Invalid ID.");
                    }
                    break;

                case 0:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);

        sc.close();
    }
}