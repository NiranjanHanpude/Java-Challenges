import java.sql.SQLOutput;
import java.util.Scanner;

class MultiplicationTableFor {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to the Table Creation ");
         System.out.print("please enter your number: ");
         int num = input.nextInt();

         for (int i = 1; i <=10;i++){
             System.out.println(num + "X2" + i + "=" + num * i);
         }
     }
}
