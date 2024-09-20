public class TestAccount {
    public static void main(String[] args) {

        Account Acc1 = new Account("001", "Alice", 5000);
        Account Acc2 = new Account("002", "Bob", 4000);

        System.out.println("Balance of Account 1 (Alice): $" + Acc1.getBalance());
        System.out.println("Balance of Account 2 (Bob): $" + Acc2.getBalance());

        Acc1.transferTo(Acc2, 1000);

        System.out.println("After transferring $1000:");
        System.out.println("Balance of Account 1 (Alice): $" + Acc1.getBalance());
        System.out.println("Balance of Account 2 (Bob): $" + Acc2.getBalance());
    }
}
