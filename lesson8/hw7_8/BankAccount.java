package lesson8.hw7_8;

public class BankAccount {
    private String ownerName;
    private double balance;
    private int creditScore;
    private boolean isFroze;

    public BankAccount(String ownerName, double balance, int creditScore, boolean isFroze) {
        this.ownerName = ownerName;
        this.balance = balance;
        this.creditScore = creditScore;
        this.isFroze = isFroze;
    }

    public void withdraw(double draw){
        this.balance -= draw;
    }
    public void deposit(double money){
        this.balance += money;
    }
    public void checkBalance(){
       if (this.balance < -50_000) {
            isFroze = true;
           System.out.println("YOU CAN'T WITHDRAW ANY MONEY ANY MORE!");

        }
        else if (this.balance < -10_000){
            creditScore -= 10;
        }
        System.out.println(STR."your credit score is \{creditScore} and your frozen count status is \{isFroze}");

    }

}
