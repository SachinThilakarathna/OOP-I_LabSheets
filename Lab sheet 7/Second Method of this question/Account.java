public class Account {

    Customer customer;
    private double balance;

    public Account(int id,String name,char gender,double balance){
        this.customer=new Customer(id,name,gender);
        setBalance(balance);
    }
    public Account(int id,String name,char gender){
    
        this.customer=new Customer(id,name,gender);
    }

    public void setBalance(double balance){
        this.balance=balance;
    }
    public double getBalance(){
        return this.balance;
    }

    public String toString(){
        return String.format("%s balance = Rs%.2f",customer,getBalance());
    }

    public void deposit(double deposit){
        if(deposit>0)
        balance+=deposit;
    }
    public void withdraw(double amount){
       if(balance>=amount)
       balance=balance-amount;
       else
       System.out.println("Withdraw amount exceeded account balance."); 
    }
    
}
