class MultiArrayDisplay{
 
    public static void main(String[] args) {
        int num[][]={{5,7,3,4},{25},{45,89,16}};
        int num1[][]={{1,2,3},{22,34}};
        change(num);
        System.out.println();
        change(num1);
   
    }

    public static void change(int y[][]){
        for(int i=0;i<y.length;i++)
        { 
            
           for(int k=0;k<y[i].length;k++)
           {
                System.out.print(y[i][k]+"\t");
           }
           System.out.println();


        }
        
    }
    
}