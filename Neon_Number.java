import java.util.Scanner;
class main
{
    public static String isneon(int n)
    {
        int temp=n,pro=0;
        n=n*n;
       while(n>0)
       {
          
           pro=pro+n%10;
           n=n/10;
       }
       if(temp==pro)
       return "Neon Number";
       else
       return "Not Neon Number";
    }
    public static void main(String args[])
    { 
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        System.out.println(isneon(n));
        sc.close();
            
         
    }
}