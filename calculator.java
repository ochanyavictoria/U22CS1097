import java.util.Scanner;
public class calculator{
    public static void main (String[] args){
        double num1, num2, result;
        char operator;
        Scanner scanner = new Scanner(System.in);
        System.out.print("input first number");
        num1 = scanner.nextDouble();
        System.out.print("enter second number");
        num2 = scanner.nextDouble();
        System.out.print("enter operand");
        operator = scanner.next().charAt(0);
        switch (operator) {
            case ('+'):
                result = num1 + num2;
                System.out.print(result);
                break;
                case ('-'):
                result = num1 - num2;
                System.out.print(result);
                break;
                case ('*'):
                result = num1 * num2;
                System.out.print(result);
                break;
                case ('/'):
                result = num1 / num2;
                System.out.print(result);
                break;
        
            default:
            System.out.println("syntax error");
                break;
        }




    }
}