import java.util.*;
class amain
{
    public static boolean isugly(int n)
    {
        int found=0;
        while(n>0)
        {   
            found=0;
            if(n%5==0)
            {
            found=1;
            n=n/5;
            }
        else if(n%3==0)
            {
            found=1;
            n=n/3;
            }
        
        else if(n%2==0)
            {
            found=1;
            n=n/2;
            }
            if(n==1 || found==0)
            break;
        }
            if(found==1)
        return true;
        else 
        return false;
        
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(isugly(n) ||n==1)
        System.out.println("Ugly Number");
        else
        System.out.println("Not Ugly Number");
    }
}