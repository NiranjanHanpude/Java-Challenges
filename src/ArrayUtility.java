import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray(){
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome Enter the Element Size: ");
        int size = input.nextInt();
        int [] Array = new int[size];
        int i = 0;
        while (i < size){
            System.out.print("Enter the Element "+ (i+1)+":");
            Array[i] = input.nextInt();
            i++;
        }
        return Array;
    }
}