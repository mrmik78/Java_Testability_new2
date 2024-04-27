//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        BmiService  service = new BmiService();

        System.out.println();
        System.out.println("Индекс массы тела:  ");
        System.out.println(service.calculate(98,  1.87));

        System.out.println();
        System.out.println("Индекс массы тела:  ");
        System.out.println(service.calculate(73,  1.82));

        System.out.println();
        System.out.println("Индекс массы тела:  ");
        System.out.println(service.calculate(77,  1.67));

    }
}
