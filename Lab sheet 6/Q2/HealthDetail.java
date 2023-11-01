public class HealthDetail {
    public static void main(String[] args) {
        MedicalRecord op1=new MedicalRecord(220,"ghghg");
        Patient op2=new Patient("sachin", op1);


        System.out.println(op2.toString()); 
       
    }
    
}
