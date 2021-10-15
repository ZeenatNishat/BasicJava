import java.util.Scanner;
public class Task4 {
      public static void main(String[] args) {

    	double numb1, numb2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:");

               numb1 = scanner.nextDouble();
        System.out.print("Enter second number:");
        numb2 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        scanner.close();
        double output;

        switch(operator)
        {
            case '+':
            	output = numb1 + numb2;
                break;

            case '-':
            	output = numb1 - numb2;
                break;

            case '*':
            	output = numb1 * numb2;
                break;

            case '/':
            	output = numb1 / numb2;
                break;

            default:
                System.out.printf("You have entered wrong operator");
                return;
        }

        System.out.println(numb1+" "+operator+" "+numb2+": "+output);
    }
}  

