package problems;

public class List {
    private final int[] list;

    public List(int[] list){
        this.list = list;
    }

    public boolean checkingSum(){
        boolean output = false;

        var number = new Console();
        int k = number.gettingTheNumber();

        for(int i = 0; i < list.length; i++){
            for(int j = i+1; j < list.length; j++){
                if((list[i] + list[j]) == k) {
                    output = true;
                    break;
                }
            }
        }

        return output;
    }

}
