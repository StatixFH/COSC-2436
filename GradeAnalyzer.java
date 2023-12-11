import java.util.Arrays;
import java.util.Scanner;

public class GradeAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("enter 12 grades ranging from 0 to 100:");
            int[] grades = new int[12];

            for (int i = 0; i < 12; i++) {
                int grade;

                do {
                    System.out.print("enter grade #" + (i + 1) + ": ");
                    grade = scanner.nextInt();

                    if (grade < 0 || grade > 100) {
                        System.out.println("invalid grade, enter a grade between 0 and 100.");
                    }

                } while (grade < 0 || grade > 100);
                grades[i] = grade;
            }

            // sorts grades
            Arrays.sort(grades);

            // displays grades
            System.out.println("\nall grades:");
            for (int grade : grades) {
                System.out.println(grade);
            }

            // calculates and displays average
            double average = calculateAverage(grades);
            System.out.println("\naverage grade: " + average);

            // allows 3 extra credit points
            System.out.print("enter up to 3 points of extra credit: ");
            
            int extraCredit = scanner.nextInt();
            double finalGrade = Math.min(average + extraCredit, 100.0);
            System.out.println("final grade (with extra credit): " + finalGrade);

            // displays grades less than 70
            System.out.println("\ngrades below 70:");

            for (int grade : grades) {
                if (grade < 70) {
                    System.out.println(grade);
                }
            }

            // Display lowest and highest grades
            System.out.println("\nlowest Grade: " + grades[0]);
            System.out.println("highest Grade: " + grades[grades.length - 1]);

            System.out.print("would you like to average another set of grades? (yes/no): ");
            String anotherSet = scanner.next().toLowerCase();

            if (!anotherSet.equals("yes")) {
                break;
            }
        } while (true);

        System.out.println("program terminated.");
    }

    public static double calculateAverage(int[] grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }
}