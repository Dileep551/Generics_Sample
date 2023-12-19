// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Printer<String , Integer> value = new Printer<>("Dileep Printer",10);

        value.print();

        Printer<Integer, String> valueString = new Printer<>(10, "Dileep");

        valueString.print();

//        Printer<Double> valueDouble = new Printer<>(10021.00);
//
//        valueDouble.print();

    }
}