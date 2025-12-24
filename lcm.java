package basic;
import java.util.Scanner;
public class lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("enter a number : ");
		int a=sc.nextInt();
		System.out.print("enter another number :");
		int b= sc.nextInt();
		sc.close();
		int lcm= (a>b)? a :b;
		while(true) {
			if(lcm%a==0 && lcm%b==0) {
				System.out.println("lcm of two numbers is "+lcm);
				break;
			}
			lcm++;
		}

	}

}
