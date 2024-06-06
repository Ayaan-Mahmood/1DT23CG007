import java.util.*;
class GCD{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,gcdd;
        System.out.println("Enter the 2 no.s whose GCD is to be calculated:");
        a=sc.nextInt();
        b=sc.nextInt();
        gcdd=gcd(a,b);
        System.out.println("The GCD of "+a+" and "+b+" = "+gcdd);
 }
    static int gcd(int m,int n){
        while(m!=n){
            if(m>n)
            m=m-n;
            else
            n=n-m;
        }return m;

    }
}