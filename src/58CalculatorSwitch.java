import java.sql.SQLOutput;
import java.util.Scanner;

class CalculatorSwitch {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("welcome to the calculator");
         System.out.println("Please enter Your First Number: ");
         int num1 = input.nextInt();
         System.out.println("Now Enter The Second Number");
         int num2 = input.nextInt();
         System.out.println("Now Enter the Operation: ");
         String operation = input.next();


         int result = switch ( operation){
             case "+" -> num1 + num2;
             case "-" -> num1 - num2;
             case "*" -> num1 * num2;
             case "/" -> num1 / num2;
             default -> -1;
         };
         System.out.println("Your Answer is: "+result );

     }
}
