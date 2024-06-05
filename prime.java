import java.util.*;
class PrimeNo{
    static boolean isPrime( int n)
    {
        for(int i=2;i<=n/2;i++){
            if(n%i==0)
            return false;
            

        }return true;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x;
        System.out.println("Enter a number:");
        x=sc.nextInt();
        boolean s=isPrime(x);
        if(s==true){
            System.out.println("The no. is prime");
        }
        else{System.out.println("The no. is not prime");}

    }
}