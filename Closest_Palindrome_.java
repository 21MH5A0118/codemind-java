import java.util.Scanner;
class main
{
    public static boolean ispalin(int n)
    {
        int temp=n,sum=0,r;
        while(n>0)
        {
            r=n%10;
            n=n/10;
            sum=sum*10+r;
        }
        if(sum==temp)
        return true;
        else
        return false;
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d1,d2;
        for(int i=n+1;;i++)
        {
         if(ispalin(i))
         {
             d1=i;
             break;
         }
        }
        for(int i=n-1;;i--)
        {
         if(ispalin(i))
         {
             d2=i;
             break;
         }
        }
        if((d1-n)==(n-d2))
        System.out.println(d2+" "+d1);
        else if((d1-n)<(n-d2))
        System.out.println(d1);
        else
        System.out.println(d2);
        
        

    }
}