import java.util.Scanner;
class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],i,n,sum=0,add=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(x[i]%2==0)
            sum=sum+x[i];
        }
        for(i=0;i<n;i++)
        {
            if(x[i]%2!=0)
            add=add+x[i];
        }
        System.out.println(Math.abs(sum-add));
    }
}