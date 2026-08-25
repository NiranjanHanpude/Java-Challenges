import java.util.Scanner;

class StudentScoreTernary {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to Student Score\n");
         System.out.println("please enter your marks: ");
         int marks = input.nextInt();
         String category = marks > 80 ? "High" : (marks > 50 ? "Moderate" :"Low");
         System.out.println("your Category is: " +category);
     }
}
