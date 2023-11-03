package B;

import A.Customer;


public class Account {
    private int accNo;
    private Customer customer;
    private double balance;

    public Account(int id,Customer customer,double balance){
        this.accNo=id;
        this.customer=customer;
        setBalance(balance);
        
    }
    public Account(int id,Customer customer){
        this.accNo=id;
        this.customer=customer;        
    }

    public int getAccNo(){
        return accNo;
    }
    public Customer gCustomer(){
        return customer;
    }
    public double getBalance(){
        return balance;
    }

    public void setBalance(double b){
        this.balance=b;
    }
   
    public String toString() {
        return String.format("%s balance = Rs %.2f",gCustomer(),getBalance());
    }

    public void deposite(double amount){
        balance+=amount;
    }
    public void withdraw(double amount){
        if(balance>amount){
            balance-=amount;
        }
        else 
        System.out.println( "Withdraw amount exceeded account balance." );
    }
}
