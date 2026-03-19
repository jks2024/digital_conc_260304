package 제네릭프린터;

public class GenericMain {
    public static void main(String[] args) {
        GenericPrinter<Powder> printer = new GenericPrinter<>();
        printer.setMaterial(new Powder());
        System.out.println(printer);

        GenericPrinter<Plastic> printer2 = new GenericPrinter<>();
        printer2.setMaterial(new Plastic());
        System.out.println(printer2);


    }
}
