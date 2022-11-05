import java.util.Scanner;
class main
{
    public static String ispalin(int n)
    {
        int temp=n,sum=0,r;
        while(n>0)
        {
            r=n%10;
            n=n/10;
            sum=sum*10+r;
        }
        if(sum==temp)
        return "True";
        else
        return "False";
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //if(ispalin(n))
        System.out.println(ispalin(n));
        //else
         // System.out.println("False");

    }
}