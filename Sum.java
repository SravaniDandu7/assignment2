
public class Sum {
    public static void main(String[] args) {
        int[] array = {100, 52, 43, 99, 42, 40, 91};
        int Sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 5 == 0 && array[i]%2==0) {
               Sum += array[i];
            }
        }
        
        System.out.println("The sum of numbers divisible by both 5 and 2 is: " + Sum);    																   }
}

