//Prgram to demonstrate Exception Handling .Check Divison by zero

package ExceptionHandling;
import java.util.Scanner;
public class ExceptionHandlingDemo {
    public static void main(String[] args) {

        int numerator;
        int denominator;
        int result;

        Scanner obj=new Scanner(System.in);
        System.out.println("enter numerator");
        numerator=obj.nextInt();
        System.out.println("enter denominator");
        denominator=obj.nextInt();

        try{
            result=numerator/denominator;
            System.out.println("result "+result);
        }

        catch (ArithmeticException e){
            System.out.println("The following exception occured:"+e);
        }

    }
}
