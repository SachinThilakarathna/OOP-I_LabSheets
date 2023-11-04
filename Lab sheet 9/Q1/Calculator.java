public class Calculator{

    public int add(int a,int b){
        return a+b;
    }

    public int add(int a,int b,int c){
        return a+b+c;
        
    }
    public int add(int a[])
    {
        int total=0;

        for(int x:a)
        {
            total+=x;
        }
        return total;
        
    }

    public static void main(String[] args) {
        Calculator op=new Calculator();
        int[] a={10,20,30,40,50};

        System.out.println("Sum of two integers -"+op.add(10,20));
        System.out.println("Sum of three integers -"+op.add(10,30,40));
        System.out.println("Sum of integer array -"+op.add(a));
        
        
    }


}