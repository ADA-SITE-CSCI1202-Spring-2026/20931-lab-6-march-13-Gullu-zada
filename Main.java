public class Main {

    public static void main(String[] args) {

        Account acc = new Account(101, "Ali", 500);

        acc.deposit(200);

        try {
            acc.withdraw(800);
        } catch (InvalidAmountException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("Balance: " + acc.getBalance());
    }

}
