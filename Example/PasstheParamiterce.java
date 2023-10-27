public class PasstheParamiterce {

    static void pass(int...num){

        int total=0;
        for(int y:num)
        {
            total+=y;

        }
        System.out.println(total);
        System.out.println("L:\\sachin\\java1\n");
    }

    public static void main(String[] args) {
        pass(1,2,4,3);
    }
    
}
