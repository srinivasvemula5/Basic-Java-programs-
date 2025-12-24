package basic;
import java.util.Scanner;
public class sumofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter till how many digits you want sum : ");
		Scanner sc= new Scanner(System.in);
		int sum=sc.nextInt();
		int total=0;
		for(int i=0;i<=sum;i++) {
			total= total+i;
		}
		System.out.println("total is :" + total);
		sc.close();
		

	}

}
