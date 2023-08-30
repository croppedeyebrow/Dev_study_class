package 제네릭연습3;

public class Main {
    public static void main(String[] args) {
        GenericPrinter<Powder> powderprinter = new GenericPrinter<>();
        powderprinter.setMaterial(new Powder());
        powderprinter.printing();

        GenericPrinter<Plastic> plasticprinter = new GenericPrinter<>();
        plasticprinter.setMaterial(new Plastic());
        plasticprinter.printing();
    }
}
