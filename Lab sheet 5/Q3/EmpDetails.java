package Q3;
import java.util.Scanner;
public class EmpDetails {
    String name1;
    int empNo1;
    float salary1;

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        EmpDetails op=new EmpDetails();   
        
        
        System.out.print("Eneter Name : ");
        op.name1=input.nextLine();

        System.out.print("Enter Employee Num : ");
        op.empNo1=input.nextInt();

        System.out.print("Enter the Salary : ");
        op.salary1=input.nextFloat();

        Employee op1=new Employee(op.name1,op.empNo1,op.salary1);
        System.out.println();
        op1.display();
        System.out.println();

    }
    
    
}
