import java.util.Scanner;
import java.util.Random;

public class RandomGuess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, amount;
		String ans;
		Random r = new Random();
		x = 1 + r.nextInt(10);
		Scanner sc = new Scanner(System.in);
		System.out.println("Guess the random number. Please enter a number");
		amount = sc.nextInt();
		while (amount != x){
			if (amount < x) {
				System.out.println(amount + " is too low. Guess again (Y)es or (N)o");
				sc.nextLine();
				ans = sc.nextLine();
				if (ans.equals("y") || ans.equals("Y")){
					System.out.println("Guess another number");
					amount = sc.nextInt();
				}else {
					System.out.println("Thanks for playing");
					break;
				}
			} else {
				System.out.println(amount + " is too high. Guess again (Y)es or (N)o");
				sc.nextLine();
				ans = sc.nextLine();
				if (ans.equals("y") || ans.equals("Y")){
					System.out.println("Guess another number");
					amount = sc.nextInt();
				}else {
					System.out.println("Thanks for playing");
					break;
				}
			}
		}
		if (amount == x){
			System.out.println("Congrats you have guessed the right number!");
		}

	}
}



