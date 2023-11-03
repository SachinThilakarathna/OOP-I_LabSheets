package B;
import A.Customer;


public class TestAccount{
    public static void main(String[] args) {
        Customer opj=new Customer(11, "Amila", 'F');
        Account op1=new Account(22,opj,2200);
        Account op2=new Account(33,opj);
        System.out.println(op1);
        System.out.println(op2);
        System.out.println();

        op1.deposite(2200);
        System.out.println("After depositing Rs 2200 into Acount 1 : "+op1);
        System.out.println();


        op2.withdraw(2000);
        System.out.println("After withdrawing Rs 2000 from Account 2 :"+ op2);
        System.out.println();
    }


    
}
