import java.util.Scanner;

public class Result {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[5];
        int totalMarks = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the marks obtained by the student in subject " + (i + 1) + ":");
            marks[i] = scanner.nextInt();
            totalMarks += marks[i];
        }

        int percentage = (int) (((double) totalMarks / 500) * 100);

        if (percentage >= 60) {
            System.out.print("The student is in the first division.");
        } else if (percentage >= 50) {
            System.out.print("The student is in the second division.");
        } else if (percentage >= 40) {
            System.out.print("The student is in the third division.");
        } else {
            System.out.print("The student has failed.");
        }
    }
}