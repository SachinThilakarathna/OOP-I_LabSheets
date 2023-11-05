package Q4;

public class BankingApplication {
    public static void main (String args[]){
        BankTransaction op=new BankTransaction();
        BankTransaction op1=new DepositTransaction();
        BankTransaction op2=new WithdrawTransaction();

        System.out.println("Generic Bank Transaction:");
        op.describeTransaction();
        System.out.println();
        System.out.println("Deposit Transaction:");
        op1.describeTransaction();
        System.out.println();
        System.out.println("Withdrawal Transaction:");
        op2.describeTransaction();
        
    }
    
}
