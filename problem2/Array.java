package problems.problem2;

public class Array {
    private final int[] array;

    public Array(int[] array){
        this.array = array;
    }

    public int[] multiplication(){
        int[] newArray = new int[array.length];
        int multiplicationResult = 1;

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                if(i != j)
                    multiplicationResult *= array[j];
            }
            newArray[i] = multiplicationResult;
            multiplicationResult = 1;
        }

        return newArray;
    }

}
