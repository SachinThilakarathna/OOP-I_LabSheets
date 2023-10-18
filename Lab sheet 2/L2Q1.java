public class L2Q1 {

    public static void main(String[] args) {
        
        System.out.println("5+2*3-1 ="+(5+2*3-1));
        System.out.println("5+4/2+6 ="+(5+4/2+6));
        System.out.println("3+6/2*3-1+2 ="+(3+6/2*3-1+2));
        System.out.println("6/2*3*2/3 ="+(6/2*3*2/3));
        
        int x=2;
        double result;
        boolean a,b,c;
        
        result=x++ + x++*--x/x++ - --x+3>>1|2;
        
        a=(x<5 && x<10);
        b=(x<5 || x<4);
        c=(x<5 && x<10);
        
        System.out.println("result is :"+result);
        System.out.println(a+"\n"+b+"\n"+c);
             
    }
}
