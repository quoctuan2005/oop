import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Objects;

public class Account {
    private double balance;
    private ArrayList<Transaction> transitionList = new ArrayList<>();

    public Account() {
        this.balance = balance;
    }

    private void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban nap vao khong hop le!");
        } else {
            this.balance += amount;
            transitionList.add(new Transaction(Transaction.DEPOSIT, amount, balance));
        }

    }

    private void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban rut ra khong hop le!");
        } else if (amount > balance) {
            System.out.println("So tien ban rut vuot qua so du!");
        } else {
            balance -= amount;
            transitionList.add(new Transaction(Transaction.WITHDRAW, amount, balance));
        }

    }

    /**
     * aaa.
     * lkdka.
     */
    public void addTransaction(double amount, String operation) {
        if (Objects.equals(operation, Transaction.DEPOSIT)) {
            deposit(amount);
        } else if (Objects.equals(operation, Transaction.WITHDRAW)) {
            withdraw(amount);
        } else {
            System.out.println("Yeu cau khong hop le!");
        }
    }

    /**
     *decimalformat.
     * print.
     */
    public void printTransaction() {
        DecimalFormat df = new DecimalFormat("#.00");
        for (int i = 0; i < transitionList.size(); i++) {
            Transaction transaction = transitionList.get(i);
            String operation = transaction.getOperation();
            String type = operation.equals(Transaction.DEPOSIT) ? "Nap tien" : "Rut tien";
            System.out.println("Giao dich " + (i + 1) + ": " + type + " $"
                    + df.format(transaction.getAmount())
                    + ". So du luc nay: $" + df.format(transaction.getBalance()) + ".");
        }
    }
}
