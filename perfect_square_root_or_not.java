import java.util.Scanner;
class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,sq;
        float d;
        n=sc.nextInt();
        sq=n*n;
        d=(float)Math.sqrt(n);
        if(d-(int)d==0)
        System.out.println("True");
        else
        System.out.println("False");
        
    }
}