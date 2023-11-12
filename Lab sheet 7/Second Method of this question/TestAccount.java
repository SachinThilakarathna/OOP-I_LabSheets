public class TestAccount {
    public static void main(String[] args) {
       // Customer op1=new Customer(1, "Sachin", 'F');
        Account op=new Account(1002,"Sachin",'F' );
        Account op2=new Account(1001, "Sachin",'F',1000);

        System.out.println("Account 1 details: " + op);
        System.out.println("Account 2 details: " + op2);

        op.deposit(5000);
        System.out.println("After depositing Rs 500.00 into Account 1:"+op);

        op2.withdraw(200);
        System.out.println("After withdrawing Rs 200.00 from Account 2:"+op2);
    }
    
}
