import java.util.InputMismatchException;
import java.lang.ArithmeticException;
import java.util.Scanner;
public class Division {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Enter first number");
            int a = scan.nextInt();
            System.out.println("Enter second number");
            int b = scan.nextInt();
            int ans = a / b;
            System.out.println("Ans:" + ans);
        }
            catch(ArithmeticException e){
               System.out.println("Cannot divide by zero");
            }
        catch(InputMismatchException e){
            System.out.println("Enter only integers");
        }
        finally{
            System.out.println("End");
        }
    }
}
