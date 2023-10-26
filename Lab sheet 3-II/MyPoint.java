public class MyPoint {
    int x;
    int y;

    MyPoint(){
        this.x=0;
        this.y=0;
    }
    MyPoint(int a,int b){
        this.x=a;
        this.y=b;
    }
    public void tostring(){
        System.out.println("("+x+","+y+")");
       
    }
    public double distance(int x,int y){
        
        double k=2,j=4;

        double m=((y-j)*(y-j)+(x-k)*(x-k));
        double d=Math.sqrt(m);

        return d;
        
    }


    public static void main(String[] args) {
        
        MyPoint op1=new MyPoint();
        MyPoint op2=new MyPoint(3,4);
        op1.tostring();
        System.out.println();
        op2.tostring();
        System.out.println();

        System.out.println("distance from (2,4) to (4,7)  "+op2.distance(3, 4));
      
        
    }

    
}
