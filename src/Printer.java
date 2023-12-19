public class Printer <T, V> {

    T printer;
    V value;

    public Printer(T printer, V value) {
        this.printer = printer;
        this.value = value;
    }

    public void print(){

        System.out.println(printer);

    }
}
