import java.util.Scanner;
public class AddMatrices {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter size: \nRow:");
		int row = sc.nextInt();
		System.out.println("Column:");
		int col = sc.nextInt();
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		System.out.println("First matrix: ");
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Second matrix: ");
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		int[][] sum = new int[100][100];
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				sum[i][j] = a[i][j] + b[i][j];
			}
		}
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				System.out.print(sum[i][j] + "\t");
			}
			System.out.print("\n");
		}
	}
}
