import java.util.Scanner;
class maim
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,sum=0;
        n=sc.nextInt();
        while(true)
        {
            sum=0;
       
        while(n>0)
        {
            int r;
            r=n%10;
            n=n/10;
            sum=sum+r;
             }
             if(sum<=9)
             break;
             else
             n=sum;
    }
    System.out.println(sum);
    }

}