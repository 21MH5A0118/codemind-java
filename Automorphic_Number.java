import java.util.Scanner;
class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,sq,d,r;
        n=sc.nextInt();
        sq=n*n;
        d=(int)Math.log10(n)+1;
        r=sq%(int)Math.pow(10,d);
        if(n==r)
        System.out.println("Automorphic Number");
        else
        System.out.println("Not an Automorphic Number");
    }
}