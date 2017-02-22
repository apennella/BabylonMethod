import java.util.Scanner;

public class Babylon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double guess;
		double number;
		double error;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter the number you wish to take the square root of");
		number = keyboard.nextDouble();
		guess = number/2;
		System.out.println("Please enter your accaeptable percent error:");
		error = keyboard.nextDouble();
		Babylon babylon = new Babylon(guess, number, error);
		System.out.println(error + " " + guess + " " + number);
	}
	double guess;
	double number;
	double error;
	public Babylon(double x, double y, double z){
		guess= x;
		number= y;
		error = z;	
		System.out.println(error + " " + guess + " " + number);
	}
	public double compute(){
		
		
	}
	}

