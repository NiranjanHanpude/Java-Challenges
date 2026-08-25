 class MaxArray {
     public static void main(String[] args) {
         System.out.print
                 ("Welcome to Finding the Maximun\n ");
         int[] arr = ArrayUtility.inputArray();

         int max = Integer.MIN_VALUE;
         for (int num : arr) {
             if (max < num) {
                 max = num;
             }
         }
         System.out.println("MAximum number is: "+max);
     }
 }
