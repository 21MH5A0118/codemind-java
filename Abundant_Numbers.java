import java.util.Scanner;
class main
{
    public static String isabundant(int n)
    {
        int sum=1;
        for(int i=2;i<=n/2;i++)
        {
           if(n%i==0)
           sum=sum+i;
        }
        if(sum>n)
        return "True";
        else
        return "False";
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isabundant(n));
        sc.close();
    }
}