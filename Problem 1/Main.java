package problems;

public class Main {

    public static void main(String[] args) {
	    Console console = new Console();
	    List list = new List(console.gettingTheList());

        System.out.println(list.checkingSum());
    }
}
