import java.util.Scanner;
public class Name {

    String fname,mname,lname;
    Name(){
        this.fname="null";   
        this.mname="null";     
        this.lname="null";


    }
    Name(String fist,String middle,String last){
        this.fname=fist;   
        this.mname=middle;     
        this.lname=last;
        

    }
    Name(Name n){
        this.fname=n.fname;   
        this.mname=n.mname;     
        this.lname=n.lname;
    }


    public void input(){
        Scanner input1=new Scanner(System.in);

        System.out.print("Enter the Fist Name : ");
        fname=input1.nextLine();

        System.out.print("Enter the Middle Name : ");
        mname=input1.nextLine();

        System.out.print("Enter the Last Name : ");
        lname=input1.nextLine();

    

    }

    public String myName(){
        char a;
        char b;

        a=fname.charAt(0);
        b=mname.charAt(0);

        return String.format("%c.%c %s",a,b,lname);
    }

    public String toString(){

        return String.format("%s %s %s",fname,mname,lname);

    }

    public static void main(String[] args) {
        System.out.println("1) Before");
        Name op=new Name();
        System.out.println("Full name : "+op.toString());
        System.out.println();
        System.out.println("After\n");
        op.input();
        System.out.println();
        System.out.println("Name with initials :"+op.myName());
        System.out.println();
        System.out.println("Full name : "+op.toString());
        System.out.println();
        
        System.out.println("2) Before\n");
        Name op1=new Name("sasmitha","sachin","thilakarathna");        
        System.out.println("Full name : "+op1.toString());
        System.out.println();
        System.out.println("After\n");
        op1.input();
        System.out.println();
        System.out.println("Name with initials :"+op1.myName());
        System.out.println();
        System.out.println("Full name : "+op1.toString());
        System.out.println();

        System.out.println("3) Before\n");
        Name op2=new Name(op1);
        System.out.println("Full name : "+op2.toString());
        System.out.println();
        System.out.println("After\n");
        op2.input();
        System.out.println();
        System.out.println("Name with initials :"+op2.myName());
        System.out.println();
        System.out.println("Full name : "+op2.toString());
        System.out.println();
    }
    
    
}
