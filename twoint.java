import java.util.Scanner;
class twoint{
	public static void main(String[] args) {
		        Scanner in = new Scanner(System.in);
		        	double num1, num2;
		        System.out.println("Enter first number");
		        num1 = in.nextDouble();
		          		        System.out.println("Enter second number");
 num2 = in.nextDouble();

	
		double sum= num1 + num2;
		double difference= num1 - num2;
		double product= num1 * num2;
		double quot= num1 / num2;
		double modulus= num1 % num2;
		System.out.println("The sum is" + sum);
		System.out.println("The difference is" + difference);
		System.out.println("The product is" + product);
		System.out.println("The quot. is" + quot);
		System.out.println("The modulus is" + modulus);
	}
}