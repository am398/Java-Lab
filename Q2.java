
import java.util.Scanner;

public class plane {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean seats[] = new boolean[10];
        int firstClass = 0;
        int econClass = 5;
        int choice;

        for (int count = 1; count <= 10; count++) {
            System.out.print("Pease Type ::\n 1 for First Class \n 2 for Economy Class: ");
            choice = input.nextInt();
            if (choice == 1) {
                if (firstClass <= 4) {
                    seats[firstClass++] = true;
                    System.out.println("Your Boarding Pass::");
                    System.out.println("Seat Number: " + (firstClass));
                    System.out.println("   Class   : First Class\n");
                } else if (firstClass > 4) {
                    System.out.print("Sorry,First class is full.");
                    if (econClass < 10) {
                        System.out.print("Would you like to Book a ticket in Economy Class?\n (1 = yes and 2 = no): ");
                        int selection = input.nextInt();
                        if (selection == 1) {
                            seats[econClass++] = true;
                            System.out.println("Your Boarding Pass::");
                            System.out.println("Seat Number: " + econClass);
                            System.out.println("   Class   : Economy Class\n");
                            continue;
                        } else {
                            System.out.print("Next flight leaves in 3 hours!");
                            System.exit(0);
                        }
                        break;
                    }
                }

            } else if (choice == 2) {
                if (econClass < 10) {
                    seats[econClass++] = true;
                    System.out.println("Your Boarding Pass::");
                    System.out.println("Seat Number: " + econClass);
                    System.out.println("   Class   : Economy Class\n");
                } else {
                    System.out.print("Sorry,Economy is full.");
                    if (firstClass <= 4) {
                        System.out.print("Would you like to Book ticket in First Class?\n (1 = yes and 2 = no): ");
                        int selection = input.nextInt();
                        if (selection == 1) {
                            seats[firstClass++] = true;
                            System.out.println("Your Boarding Pass::");
                            System.out.println("Seat Number: " + firstClass);
                            System.out.println("   Class   : First Class\n");
                            continue;
                        } else {
                            System.out.println("Next flight leaves in 3 hours!");
                            System.exit(0);
                        }
                        break;
                    }

                }
            }
        }

    }
}
