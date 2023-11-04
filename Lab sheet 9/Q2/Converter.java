public class Converter {
    public int converter(double a){
        return (int)a;
    }
    public double converter(int a){
        return (double)a;
    }
    public int converter(String a){
        return Integer.parseInt(a) ;
        }
    public static void main(String[] args) {
        Converter op=new Converter();
        System.out.println("Double -> Integer -"+op.converter(10.56));
        System.out.println("Integer -> Double -"+op.converter(50));
        System.out.println("String -> Integer -"+op.converter("600"));                
    }
    
}
