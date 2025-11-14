import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var numbers = new Array(4);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(50);
        numbers.removeAt(5);
        numbers.removeAt();
        numbers.print();
    }
}
