public class L2Q10 {
    static void largest(int array[][])
    {
        for(int i=0;i<array.length;i++)
        {
            int large=array[i][0];

            for(int k=0;k<array[i].length;k++)
            {
                if(array[i][k]>large)
                {
                    large=array[i][k];

                }
               
            }
            System.out.println((i+1)+"row largest number is :"+large);
        }
        System.out.println();
    }

    static void smallest(int array[][])
    {
        for(int i=0;i<array.length;i++)
        {
            int small=array[i][0];

            for(int k=0;k<array[i].length;k++)
            {
                if(array[i][k]<small)
                {
                    small=array[i][k];

                }
               
            }
            System.out.println((i+1)+"row smallest number is :"+small);
        }
        System.out.println();
    }

    static void sumrow(int array[][])
    {
        
        for(int i=0;i<array.length;i++)
        {
            int sum=0;
            for(int j=0;j<array.length;j++)
            {
                sum=sum+array[j][i];
            }
            System.out.println("Sum of"+(i+1)+"row :"+sum);
            
        }
        System.out.println();
    }
    static void sumcolum(int array[][])
    {
        
        for(int i=0;i<array.length;i++)
        {
            int sum=0;
            for(int j=0;j<array.length;j++)
            {
                sum=sum+array[i][j];
            }
            System.out.println("Sum of"+(i+1)+"row :"+sum);
            
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        int[][] array={{40,50,60},{40,50,60},{70,80,90}};
        largest(array);
        smallest(array);
        sumrow(array);
        sumcolum(array);

    }
    
}
