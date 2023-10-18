import java.util.Scanner;
public class L2Q2 {

    static String input()
    {
        Scanner input= new Scanner(System.in);
        System.out.print("input the text :");
        String sen=input.nextLine();
        return sen;
    }
    static String countw(String sen)
    {
        String newsen=sen.replaceAll(" ","");
        int leng=(sen.length()-newsen.length())+1;
        System.out.println("Number of words :"+leng);
        return newsen;
    }
    static void vowel(String newsen)
    {
        int leng=newsen.length();
        int count=0;
        char letter;
        for(int i=0;i<leng;i++)
        {
            letter=newsen.charAt(i);
            if(letter=='a' || letter=='e' || letter=='i' || letter=='o' || letter=='u' || letter=='A' || letter=='E' || letter=='I' || letter=='O' || letter=='U')
            {
                count++;
            }
        }
        System.out.println("The number of vowels ="+count);

    }

    static void lowercase(String newsen)
    {
        int leng=newsen.length();
        int count=0,count1=0;
        char letter;
        for(int i=0;i<leng;i++)
        {
            letter=newsen.charAt(i);
            if(letter>='a' && letter<='z')
            {
                count++;
            }
        }
        System.out.println("The number of lowercase characters ="+count);
        for(int i=0;i<leng;i++)
        {
            letter=newsen.charAt(i);
            if(letter>='A' && letter<='Z')
            {
                count1++;
            }
        }
        System.out.println("The number of Uppercase characters ="+count1);


    }

    static void frequency(String newsen)
    {
    
        int frequency[]=new int[256];
        
        for(int i=0;i<newsen.length();i++)
        {
            frequency[(int)newsen.charAt(i)]++;
        }


        for(int i=0;i<frequency.length;i++)
        {
            if(frequency[i] != 0)
            {
                System.out.println((char)i+"-"+frequency[i]);
            }
        }

    }
    public static void main(String args[])
    {
        String a=countw(input());
        vowel(a);
        lowercase(a);
        frequency(a);       
    }
}
