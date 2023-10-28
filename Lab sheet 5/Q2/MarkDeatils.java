package Q2;

import java.util.Scanner;
public class MarkDeatils {
    int id2;
    String name2;
    char gender2;
    String subjectName2;
    float marks2;
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        MarkDeatils op=new MarkDeatils();

        System.out.print("Enter the Name : ");
        op.name2=input.nextLine();

        System.out.print("Enter the Subject Name : ");
        op.subjectName2=input.nextLine();

        System.out.print("Enter the ID : ");
        op.id2=input.nextInt();

        System.out.print("Enter the Gender : ");
        op.gender2=input.next().charAt(0);


        System.out.print("Enter the Marks : ");
        op.marks2=input.nextFloat();

        Students op1=new Students( op.name2,op.id2,op.gender2,op.subjectName2,op.marks2);
        System.out.println();
        System.out.println(op1.toString());
    }
    
}
