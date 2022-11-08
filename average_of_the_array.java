import java.util.Scanner;
class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,x[];
        n=sc.nextInt();
        x=new int[n];
        float sum=0;
        
        for(i=0;i<n;i++)
          x[i]=sc.nextInt();
         for(i=0;i<n;i++)
         {
             sum=sum+x[i];
         }
          System.out.format("%.2f",sum/n);
    }
    
}