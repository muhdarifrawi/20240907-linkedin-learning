package EncapsulationPractice;

public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(){
        this.owner = "N/A";
        this.balance = 0;
    }

    public BankAccount(String owner, double balance){
        this.owner = owner;
        this.balance = Math.max(balance, 0);
    }

    public void setOwner(String owner){
        this.owner = owner;
    }

    public String getOwner(){
        return this.owner;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return this.balance;
    }
    // withdraw method
    public double withdraw(double withdrawalAmount){
        this.balance = this.balance - withdrawalAmount;
        return withdrawalAmount;
    }
    //deposit method
    public double deposit(double depositAmount){
        this.balance = this.balance + depositAmount;
        return depositAmount;
    }
}
