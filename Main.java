//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the first number");
        double num1 = scanner.nextDouble();
        System.out.println("enter the second number");
        double num2 = scanner.nextDouble();

        System.out.println("enter your operation (* / + -) :");
        char operation = scanner.next().charAt(0);

        double result;

        switch(operation){
            case'*':
                result = num1 * num2;
                break;
            case'/':
                if(num2 != 0){
                    result = num1 / num2;
                }else{
                    System.out.println("math error");
                    return;
                }
                break;
            case'+':
                result = num1 + num2;
                break;
            case'-':
                result = num1 - num2;
            default:
                System.out.println("math error");
                return;
        }
        System.out.println("result: " + result);
        scanner.close();

    }

}