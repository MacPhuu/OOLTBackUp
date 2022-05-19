import java.util.Scanner;
public class Triangle {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("n = ");
		int n = keyboard.nextInt();
		double k = 0;
		for(int i = 1 ; i <= n ;i++) {
			for(int j = 1; j <= n*2 - k; j++ ) System.out.print(" ");
			for(int j = 1; j <= i+k; j++) System.out.print("*");
			k += 1;
			System.out.print("\n");
		}
	}
}
