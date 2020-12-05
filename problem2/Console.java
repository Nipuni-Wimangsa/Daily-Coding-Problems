package problems.problem2;

import java.util.Arrays;
import java.util.Scanner;

public class Console {
    private final Scanner input = new Scanner(System.in);

    public int[] inputArray(){
        System.out.print("Size of the array: ");
        int[] array = new int[input.nextInt()];

        for(int i = 0; i < array.length; i++){
            System.out.printf("Number %d: " , i);
            array[i] = input.nextInt();
        }

        return array;
    }

    public void outputArray(int[] array){
        System.out.println(Arrays.toString(array));
    }
}
