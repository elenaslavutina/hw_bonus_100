public class Main {
    public static void main(String[] args) {
        int startDeposit = 100;
        int deposit = 1000;
        int bonus = 0;
        if (1000 <= deposit) {
            bonus = deposit / 100;
        }
        System.out.println("Бонус  = " + bonus);
    }
}
