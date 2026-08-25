import java.util.Scanner;

class PrimeFro {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to Prime number Checker");
         System.out.print("please enter the Number: ");
         int num = input.nextInt();
         System.out.println("your number is "
                 +(isprime(num) ? "prime" : "Not prime"));

     }
     public static boolean isprime(int num){
         for (int i= 2; i < num; i++){
             if (num % i == 0){
                 return true;
             }

         }
         return true;
     }
}
