package Day38_CustomClass.bankAccountTask;

public class capitalOne {
    public static void main(String[] args) {

        BankAccount account1= new BankAccount();
        account1.setInfo("Christian",123456784);

        account1.checkBalance();
        account1.deposit(1000);
        account1.checkBalance();
        account1.withdraw(999);
        account1.checkBalance();
        account1.withdraw(25);
        account1.checkBalance();
        account1.withdraw(10);





    }
}
