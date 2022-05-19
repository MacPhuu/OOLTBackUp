import java.util.Scanner;
public class DayOfMonth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What YEAR is this?");
		int year = sc.nextInt();
		System.out.println("Which MONTH?");
		int month = sc.nextInt();
		boolean isLeap;
		if(year % 4 != 0) isLeap = false;
		else if(year % 100 == 0 && year % 400 != 0) isLeap = false;
		else isLeap = true;
		int day = 0;
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			day = 31;
			break;
		
		case 4: case 6: case 9: case 11:
			day = 30;
			break;
		
		case 2:
			day = isLeap?29 : 28;
			break;
		
		default:
			System.out.print("Not a month");
			break;
		
		}
		if(month >= 1 && month <= 12) System.out.print("This month has: " + day +" days.");
	}
}
