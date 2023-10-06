// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int bal = 100;
        int pop = 1535;
        int bounce = pop / 100;
        int bal1;
        if (pop >= 1000) {
            bal1 = bal + pop + bounce;
        } else {
            bal1 = bal + pop;
        }
        System.out.println("При пополнении на сумму " + pop + " при текущем балансе " + bal);
        System.out.println("На вашем счету будет сумма " + bal1);
        System.out.println("Сумма бонусов " + bounce);
    }
}