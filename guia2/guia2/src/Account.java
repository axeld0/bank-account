public class Account {

    private double balance;


    public Account(double balance) {
        this.balance = balance;

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                '}';
    }

    public void insertMoney (double moneyInserted)
    {
        balance+= moneyInserted;
    }

    public double withdrawMoney (double moneyWithdrawed)
    {
        int error = 0;

        if(balance > moneyWithdrawed)
        {
        balance -= moneyWithdrawed;}
        else
        {
            error = -1;
        }
        return error;
    }


}
