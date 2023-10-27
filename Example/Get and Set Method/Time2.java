public class Time2 {
    public static void main(String[] args) {
        TimeCal op =new TimeCal();
        TimeCal op1=new TimeCal(11);
        TimeCal op2 =new TimeCal(11,45);
        TimeCal op3 =new TimeCal(11,45,35);
                
        System.out.printf("%s\n",op.display());
        System.out.printf("%s\n",op1.display());
        System.out.printf("%s\n",op2.display());
        System.out.printf("%s\n",op3.display());
    }
    
}
