package account;

public class entities {
    private int number;
    private String holder;
    private double balance;

    
    public entities(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }


    public entities(int number, String holder, double initialdeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialdeposit);
    }

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }


    public void setHolder(String holder) {
        this.holder = holder;
    }


    public double getBalance() {
        return balance;
    }

     public void deposit(double amount){
        balance +=  amount;

     }

     public void withdraw(double amount) {
        balance -= amount + 5.0;
     }
 
      public String toString() {
        return "account " + number + ", holder: " + holder + ", balance: $ " + String.format("%.2f", balance);
      }
}
