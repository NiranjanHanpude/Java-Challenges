import java.util.Scanner;

class OccurrencesForEach {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to Finding Occurances");
         int [] nums = ArrayUtility.inputArray();
         System.out.println("Now enter The number you want to Search ");
         int element = input.nextInt();
         int occ = countoccurances(nums,element);
         System.out.println("Your Number was found: "+occ +"time");

     }
     public static int countoccurances(int[] nums, int element){
         int occ = 0;
         for(int num : nums){
             if (num == element){
                 occ++;
             }
         }
         return occ;
     }
}
