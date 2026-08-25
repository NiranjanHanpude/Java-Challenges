import java.util.Scanner;

class MinimumTernary {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welocme to finding the Minimum\n");
        System.out.print("Please enter your First number: ");
        int num1 = input.nextInt();
        System.out.print("Please enter your Second Number: ");
        int num2 = input.nextInt();
        MinimumTernary ternary = new MinimumTernary();
        int min = ternary.min(num1,num2);
        System.out.println("Minimum number is: "+ min );
    }
    public int min(int num1 , int num2){
        return num1  < num2 ? num1 : num2;

    }
}
