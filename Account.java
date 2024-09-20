public class Account {
    private String id;
    private String name;
    private int balance;

    // Constructor
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    // Methods
    public int credit(int amount) {
        this.balance += amount;
        return this.balance;
    }

    public int debit(int amount) {
        if (amount <= balance) {
            this.balance -= amount;
            return this.balance;
        } else {
            System.out.println("Amount exceeded balance.");
            return this.balance;
        }
    }

    public int transferTo(Account anotherAccount, int amount) {
        if (amount <= balance) {
            this.balance -= amount;
            anotherAccount.credit(amount);
            return this.balance;
        } else {
            System.out.println("Amount exceeded balance.");
            return this.balance;
        }
    }

    public String toString() {
        return "Account[id=" + id + ", name=" + name + ", balance=" + balance + "]";
    }
}

//Worked on for ~1 hour, 5 minutes