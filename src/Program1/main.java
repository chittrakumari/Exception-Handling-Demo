
/*Create a custom exception class MyException, this exception is throw when user enter
"0" as integer input.
 */

package Program1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[]args){
        try{
            checkInput();
        }
        catch(MyException|InputMismatchException e){
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
    public static void checkInput() throws MyException{
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        if(a!=0){
            System.out.println(a);
        }
        else{
           throw new MyException("input can not be 0");
        }

    }
}
