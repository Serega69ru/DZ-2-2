// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int bal = 100;
        int refill = 1535;
        int bounce = refill / 100;
        int bal1;
        if (refill >= 1000) {
            bal1 = bal + refill + bounce;
        } else {
            bal1 = bal + refill;
        }
        System.out.println("При пополнении на сумму " + refill + " при текущем балансе " + bal);
        System.out.println("На вашем счету будет сумма " + bal1);
        System.out.println("Сумма бонусов " + bounce);
    }
}