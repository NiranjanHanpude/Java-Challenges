import java.util.Scanner;

class OddevenTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Wlcome to odd or even\n");
        System.out.println("Please enter your Number: ");
        int num = input.nextInt();
        String result = num % 2 == 0 ? "even" : "Odd";
        System.out.println("Your Number is : "+result);
    }
}
