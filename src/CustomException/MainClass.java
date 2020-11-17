
/*Program to demonstrate custom excetion.Exception will be thrown when a user enters a
 number less than 100;
 */

package CustomException;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        try{
            checkInput();
        }
        catch (CustomExceptionClass|InputMismatchException|IllegalStateException e){
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();

        }
    }
    public static void checkInput() throws CustomExceptionClass{
        int a;
        Scanner obj=new Scanner(System.in);
        a=obj.nextInt();
        if(a>100){
            System.out.println(a);
        }
        else{
            throw new CustomExceptionClass("value should be greater than 100");
        }
    }
}
