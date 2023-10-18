public class L2Q7 {   
    public static void main(String[] args) {
        int[] text={202,345,1001,235,875};
        for(int i=4;i>=0;i--)
        {
            System.out.print(text[i]);        
            int j=i;
            while(j==i && j!=0)
            {
                System.out.print(",");
                j--;
            }
        }
    System.out.println();
    }
    
}
