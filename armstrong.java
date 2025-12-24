package basic;
import java.util.Scanner;
public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter number");
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		
		int originalnum=num;
		int sum=0;
		
		while(num!=0) {
			int digit=num%10;
			sum+=(digit*digit*digit);
			num=num/10;
		}
		if(sum==originalnum) {
			System.out.println("it is armstrong");
		}
		else {
			System.out.println("it is not armstrong");
		}
		sc.close();
	}

}
