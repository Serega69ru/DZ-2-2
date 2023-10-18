// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int refill = 1535;
        int bounce = refill / 100;
        int result;
        if (refill >= 1000) {
            balance = balance + refill + bounce;
        } else {
            result = balance + refill;
        }
        System.out.println("При пополнении на сумму " + refill + " при текущем балансе " + balance);
        System.out.println("На вашем счету будет сумма " + result);
        System.out.println("Сумма бонусов " + bounce);
    }
}