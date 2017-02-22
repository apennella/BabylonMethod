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
		
		/**public int getGuess(){
			return guess;
		}
		public double getNumber(){
			return number;
		}
		public double getError(){
			return error;
		}*/


	}
	/**int guess;
	double number;
	double error;
	public Babylon(){
		guess = getGuess();
		error = getError();
		number= getNumber();
	}
	System.out.println(error + " " + number " " + guess + "class");
	*/
}

