package basic;
import java.util.Scanner;
public class gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("enter a number :");
		int a=sc.nextInt();
		System.out.print("enter another number :");
		int b=sc.nextInt();
		sc.close();
		int gcd =1;
		for(int i =1;i<=a && i<=b;i++) {
			if(a%i==0 && b%i==0) {
				gcd=i;
			}
		}
		System.out.println("the GCD is "+gcd);

	}

}
