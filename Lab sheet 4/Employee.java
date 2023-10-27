public class Employee {

    String f_name;
    String l_name;
    double salary;

    public Employee(){

        this.f_name="null";
        this.l_name="null";
        this.salary=0.0;

    }

    public Employee(String fname){

        this.f_name=fname;
        this.l_name="null";
        this.salary=0.0;

    }
    public Employee(String fname,String lname){

        this.f_name=fname;
        this.l_name=lname;
        this.salary=0.0;

    }
    public Employee(String fname,String lname,double salary){

        this.f_name=fname;
        this.l_name=lname;
        this.salary=salary;

    }

    public Employee(Employee n){
        this(n.f_name,n.l_name,n.salary);
    }

    public void display(){
        System.out.printf(" Fist name is : %s\n Last Name is : %s\n Monthly Salary is : %2f\n ",f_name,l_name,salary);
    }

    public static void main(String[] args) {
        Employee op=new Employee();
        Employee op1=new Employee("sachin");
        Employee op2=new Employee("sachin","thilakarathna");
        Employee op3=new Employee("sachin","thilakarathna",250000f);
        Employee op4=new Employee(op3);

        op.display();
        System.out.println();
        op1.display();
        System.out.println();
        op2.display();
        System.out.println();
        op3.display();
        System.out.println();
        op4.display();
        System.out.println();

    }
    
}
