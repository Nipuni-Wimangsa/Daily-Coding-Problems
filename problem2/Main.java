package problems.problem2;

public class Main {

    public static void main(String[] args) {
        var console = new Console();
        var array = new Array(console.inputArray());

        console.outputArray(array.multiplication());
    }
}
