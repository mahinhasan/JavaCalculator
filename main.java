import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner sc  = new Scanner();
		double x,y,deci;
		x = sc.nextDouble();
		y = sc.nextDouble();
		B.Calculator cal = new S.Calculator();

		System.out.println("Summation is : "+cal.summation(x,y));
		System.out.println("Subtration is : "+cal.subtraction(x,y));
		System.out.println("Multiplication is : "+cal.multiplication(x,y));
		System.out.println("Division is : "+cal.division(x,y));
		System.out.println("XtoY is : "+(((S.Calculator)cal).XtoY(x,y)));
		System.out.println("Enter your Decimal number : ");
		deci = sc.nextDouble();
		System.out.println("Your Binary number : ");
		((S.Calculator)cal).decmialToBinary(deci);

		System.out.println("Factorial is : "+(((S.Calculator)cal).factorial(x)));


	}
}