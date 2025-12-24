package basic;
import java.util.Scanner;

public class primenumbersinarange {

    public static void main(String[] args) {
        
        System.out.println("enter the range start number");
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();

        System.out.println("enter the range end number");
        int q = sc.nextInt();

        int count = 0;
for (int i = p; i <= q; i++) {

            boolean isprime = true;  // RESET for every number
            if (i <= 1) {
                isprime = false;
            } else {
                for (int j = 2; j < i; j++) {   // check till i, not q
                    if (i % j == 0) {
                        isprime = false;
                        break;
                    }
                }
            }

            if (isprime) {
                count++;
            }
        }
        sc.close();

        System.out.println("the number of prime numbers in that range is " + count);
    }
}
