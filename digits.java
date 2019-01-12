import java.util.Scanner;
class digits{	
	public static void main(String[] args) {
	 Scanner value = new Scanner (System.in);
         
        int number; //number entered by the user
        int digit1; //first digit of number
        int digit2; //second digit of number
        int digit3; //third digit of number
        int digit4; //fourth digit of number
        int digit5; //fifth digit of number
         
        System.out.println (); //displays a blank line
         
        System.out.print ("Enter An Integer Number Consisting of Five Digits "
                + "e.g 12345: ");
        number = value.nextInt();
         
        digit5 = number % 10;
        digit4 = (number % 100)/10;
        digit3 = (number % 1000)/100;
        digit2 = (number % 10000)/1000;
        digit1 = number / 10000;
         
        System.out.println ();
         
        System.out.printf ("%d   %d   %d   %d   %d\n", digit1, digit2, digit3, 
                digit4, digit5);	
	}

		

	}
