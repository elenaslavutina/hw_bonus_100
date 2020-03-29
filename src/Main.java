public class Main {
    public static void main(String[] args) {
        int start_deposite = 100;
        int depozit = 1000;
        int bonus = 0;
        if(1000 <= depozit) {
            bonus = depozit / 100;
        }
        System.out.println("Бонус  = " + bonus);
    }
}
