public class L2Q9 {
    public static void main(String args[])
    {
        int[][] array={{40,50,60},{40,50,60},{70,80,90}};

        for(int i=0;i<array.length;i++)
        {

            for(int j=0;j<(array[i].length) ;j++)
            {
                System.out.println("Row ["+i+"]: Column ["+j+"] :"+array[i][j]);
            }
             
        }
        
       
    }
    
}
