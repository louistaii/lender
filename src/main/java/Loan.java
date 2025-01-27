public class Loan {
    private String borrower;
    private int amount;
    private boolean isPaid;
    private double interestRate; //these cnt be accessed outside of class so need to add public get commands below

    public static int maxloanamount = 0;
    //this is a constructor for class Loan that sets intitial values
    public Loan(String borrower, int amount, double interestRate) {
        this.borrower = borrower;
        this.amount = amount;
        this.interestRate = interestRate;
        this.isPaid = false;
        if (amount>maxloanamount){
           maxloanamount=amount;
        }
    }

    public void setAsPaid() {
        isPaid = true;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public String getBorrower() {
        return borrower;
    }

    public String getDisplayString() {
        return borrower + ": " + amount;
    }

    public double getProfit() {
        return amount * interestRate;
    }
}
