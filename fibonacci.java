package basic;
import java.util.Scanner;
public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter upto number");
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		int a=0,b=1;
		for(int i=0;i<num;i++) {
			System.out.print(a+" ");
			int c=a+b;
			a=b;
			b=c;
		}
		sc.close();
	}

}
