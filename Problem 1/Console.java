package problems;

import java.util.Scanner;

public class Console {
    private final Scanner input = new Scanner(System.in);

    public int[] gettingTheList() {
        System.out.print("Number of items in the list: ");
        int nItems = input.nextInt();
        int[] array = new int[nItems];

        System.out.println("Enter the list: ");

        for (int i = 0; i < array.length; i++)
            array[i] = input.nextInt();

        return array;
    }

    public int gettingTheNumber(){
        System.out.print("Enter the sum: ");
        return input.nextInt();
    }
}
