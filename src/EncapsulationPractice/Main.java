package EncapsulationPractice;

public class Main {
    public static void main (String [] args){
        BankAccount ba = new BankAccount();

        ba.setOwner("John Doe");

        ba.deposit(5000);
        String accountOwner = ba.getOwner();
        double accountBalance = ba.getBalance();

        System.out.println("Account owner: " + accountOwner);
        System.out.println("Accouunt balance: " + accountBalance);
    }
}
