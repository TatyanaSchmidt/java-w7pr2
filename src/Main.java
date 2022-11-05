import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] intArray = new int[]{2,3,4,5,6,7};
        ArrayList<Integer> number = new ArrayList<>();
        for (int i = 0; i < intArray.length; i++){
            if (intArray[i] % 2 != 0){
                Integer numberOdd = Integer.valueOf(intArray[i]);
                number.add(numberOdd);
                intArray[i] = 0;
            }
        }
        System.out.println(Arrays.toString(intArray));
        System.out.println(number);
    }
}