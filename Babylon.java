import java.util.Scanner;

public class Babylon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int guess;
		double number;
		double error;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter the number you wish to take the square root of");
		number = keyboard.nextDouble();
		System.out.println("Please enter you guess for the square root of that number");
		guess = keyboard.nextInt();
		System.out.println("Please enter your accaeptable percent error:");
		error = keyboard.nextDouble();
		System.out.println(error + " " + guess + " " + number);
		Babylon babylon = new Babylon(guess, number, error);
	}
	int guess;
	double number;
	double error;
	public Babylon(int x, double y, double z){
		guess= x;
		number= y;
		error = z;
		System.out.println(error + " " + guess + " " + number);
	}
	
	}

