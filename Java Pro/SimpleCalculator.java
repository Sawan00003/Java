import java.util.Scanner;

public class SimpleCalculator{
public static void main(String arg[]){
  
Scanner sc = new Scanner(System.in);


    System.out.print("Enter Number 1St Number : ");
    
   int fnum = sc.nextInt();
   System.out.print("Enter Number 2nd Number : ");
   int snum = sc.nextInt();
   
   System.out.print("Enter the type of operation you want to perform (+, -, *, /, %): ");
    String operation = sc.next();
    System.out.println("You want to perform :" + fnum + "" +operation + "" + snum);

     int output = performOperation(fnum, snum, operation);
     System.out.println(output);

     
}
    public static int performOperation(int fnum,   int snum,  String operation)
{
        int result=1;
        switch (operation) {
            case "+":
                result = fnum + snum;
                break;
            case "-":
                result = fnum - snum;
                break;
            case "*":
                result = fnum * snum;
                break;
            case "%":
                result = fnum % snum;
                break;
            case "/":
                result = fnum / snum;
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }
        return result;

    }       
    
}   
