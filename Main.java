public class Main {
    public static void main(String[] args) {
        int currentBalance = 2_000_000_000;
        int transaction = 500_000_000;
        int finalBalance = currentBalance + transaction;
        System.out.println("Транзакция выполнена успешно. Сумма на счёте " +finalBalance);
    }
}
