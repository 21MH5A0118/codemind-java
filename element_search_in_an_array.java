import java.util.Scanner;
class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,x[],found=0,m;
        n=sc.nextInt();
        x=new int[n];
        
        for(i=0;i<n;i++)
          x[i]=sc.nextInt();
          m=sc.nextInt();
         for(i=0;i<n;i++)
         {
             if(m==x[i])
             { 
                 found=1;
             }
         }
             if(found>=1)
         
          System.out.format("True");
          else
          System.out.format("False");
    }
    
}