import java.util.Scanner;

class Calculator 
{

    public static int add(int num1, int num2)
    {

        int r = num1 + num2;
        System.out.println("Addition of Number " + num1 + "+" + num2 + " = " + r);
        return 0;
        
    }

    public static int sub(int num1, int num2)
    {
        int r = num1 - num2;
        System.out.println("Subtraction of Number " + num1 + "-" + num2 + " = " + r);
        return 0;
    }

    public static int mul(int num1, int num2)
    {
        int r = num1 * num2;
        System.out.println("Multiplication of Number " + num1 + "x" + num2 + " = " + r);
        return 0;
    }



}

public class Demo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Entern Number 1 : ");
        int num1 = sc.nextInt();
        System.out.println("Entern Number 2 : ");
        int num2 = sc.nextInt();
        System.out.print("Enter the type of operation you want to perform (+, -, *, /, %): ");
        String operation = sc.next();
        PerformOperation op = new PerformOperation();
        op.performOperation(num1, num2, operation);
        sc.close();
        //System.out.println(output);
    }    
        
    
}

 class PerformOperation{

     public int performOperation(int num1,   int num2,  String operation)
        {
                switch (operation) {
                    case "+":
                        Calculator.add(num1 , num2);
                        break;
                    case "-":
                    Calculator.sub(num1 , num2);
                        break;
                    case "*":
                    Calculator.mul(num1 , num2);
                        break;
                    default:
                        System.out.println("Invalid operation");
                        break;
                }
                return 0;
    }

    
}
