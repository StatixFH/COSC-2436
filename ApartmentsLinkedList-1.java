import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;


public class ApartmentsLinkedList {
    public static void main(String[] args) {
        LinkedList<Apartment> apartmentList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        // prompt user, for apartment details till sentinel value entered
        while (true) {
            System.out.println("Enter apartment details or type 'exit' to finish:");

            System.out.print("Street Address: ");
            String streetAddress = scanner.nextLine();

            if (streetAddress.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Apartment Number: ");
            int apartmentNumber = scanner.nextInt();
            scanner.nextLine(); // consume newline character

            System.out.print("Monthly Rent: ");
            double monthlyRent = scanner.nextDouble();
            scanner.nextLine(); // consume newline character

            System.out.print("Number of Bedrooms: ");
            int numberOfBedrooms = scanner.nextInt();
            scanner.nextLine(); // consume newline character

            Apartment apartment = new Apartment(streetAddress, apartmentNumber, monthlyRent, numberOfBedrooms);
            apartmentList.add(apartment);
        }

        // sort apartments by rent value
        Collections.sort(apartmentList);

        // display sorted list
        System.out.println("\nSorted List of Apartments by Rent:");
        for (Apartment apartment : apartmentList) {
            System.out.println(apartment);
        }
    }
}