package Q3;

public class Employee {

    private String name;
    private int empNo;
    private float salary;

    public Employee(String n,int en,float s){
        setName(n);
        setEmpNo(en);
        setSalary(s);

    }

    public void setName(String name){
        if (name != null && !name.isEmpty()){
            this.name=name;
        }else{
            System.out.println("Invalid name. Name should not be null or empty."); 
        }

    }

    public void setEmpNo(int empNo){
        this.empNo=empNo;

    }

    public void setSalary(float salary){
        if(salary>0){
            this.salary=salary;
        }else{
            System.out.println("Invalid salary. Salary should be positive.");
        }

    }

    public String getName(){
        return name;
    }
    public int getEmpNo(){
        return empNo;
    }

    public float getSalary(){
        return salary;
    }

    public void display(){
        System.out.println("Name is : "+getName()+"\nEmployee No : "+getEmpNo()+"\nSalary is : "+getSalary());
    }

    
    
}
