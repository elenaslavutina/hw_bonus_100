public class Main {
    public static void main(String[] args) {
        int StartDeposit = 100;
        int Deposit = 1000;
        int bonus = 0;
        if (1000 <= Deposit) {
            bonus = Deposit / 100;
        }
        System.out.println("Бонус  = " + bonus);
    }
}
