package basic;
import java.util.Scanner;
public class checkprime {
	public static void main(String[] args) {
		System.out.println("enter a prime number");
		Scanner sc= new Scanner(System.in);
		int p = sc.nextInt();
		int count=0;
		for(int i=2;i<=p;i++) {
			if(p%i==0) {
				count++;
			}
		}
		if(count==1) {
			System.out.println("prime number");
		}
		else {
			System.out.println("not a prime");
		}
		sc.close();

	}

}
