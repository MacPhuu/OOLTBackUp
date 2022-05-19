import java.util.Scanner;
public class InputFromKeyboard {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String strName = keyboard.nextLine();
		System.out.println("How are you?");
		int  iAge = keyboard.nextInt();
		System.out.println("How tall are you(m)?");
		double dheight = keyboard.nextDouble();
		
		System.out.println("Mrs/Ms. " + strName +", " + iAge +" years old. " + "Your height is "+ dheight +".");
		
	}
}
