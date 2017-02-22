import java.util.Scanner;

public class Babylon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double guess;
		double number;
		double error;
		double square;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter the number you wish to take the square root of");
		number = keyboard.nextDouble();
		guess = number/2;
		System.out.println("Please enter your accaeptable percent error:");
		error = keyboard.nextDouble();
		square = Math.sqrt(number);
		Babylon babylon = new Babylon(guess, number, error, square);
		System.out.println(error + " " + guess + " " + number+ " " +square);
		
	}
	double guess;
	double number;
	double error;
	double square;
	public Babylon(double w,double x, double y, double z){
		guess= w;
		number= x;
		error = y;
		square = z;
		System.out.println(error + " " + guess + " " + number + " " +square);
	}

}