import java.util.Scanner;
public class SortAndCalculate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of elament: ");
		int n = sc.nextInt();
		int[] a = new int[100];
		int sum = 0;
		double avr;
		System.out.println("Enter element: ");
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			sum += a[i];
		}
		avr =(double) sum/n;
		for(int i = 0; i < n - 1; i++) {
			for(int j = i + 1; j < n; j++) {
				if(a[i] > a[j]) {
					int tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}
		for(int i = 0 ; i< n ; i++) {
			System.out.print(a[i] +" ");
		}
		System.out.print("\n");
		System.out.println("Sum = " + sum);
		System.out.println("Avarage = " + avr);
	}
}
