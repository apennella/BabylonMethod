import java.util.Scanner;

public class Babylon {
	private double guess;
	private double number;
	private double square;
	private double error;
	Babylon(double a, double b, double c, double d){
		guess = a;
		number= b;
		error = c;
		square= d;
}
	public void print(){
		System.out.println(guess);
		System.out.println(number);
		System.out.println(square);
		System.out.println(error);
	}
}