import java.util.Scanner;
class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int x=(int)Math.sqrt(n);
        if(x*(x+1)==n)
        System.out.println("YES");
        else
         System.out.println("NO");
    }
}