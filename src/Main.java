public class Main {
    public static void main(String[] args) {
        int residue = 100; //остаток
        int replenishment = 900; //текущий платеж
        int bonus = replenishment / 100; //бонус 1р на каждые 100р
        int balance; //текущий баланс

        System.out.println("Остаток средств: " + residue + " руб.");
        System.out.println("Пополнение на: " + replenishment + " руб.");
            if (replenishment >= 1000) {
                balance = residue + replenishment + bonus;
                System.out.println("Ваш баланс: " + balance + "руб.");
                }
                else {
                    balance = residue + replenishment;
                    bonus = 0;
                    System.out.println("Ваш баланс: " + balance + " руб.");
        }
        System.out.println("Ваш бонус: " + bonus + " руб.");
    }
}