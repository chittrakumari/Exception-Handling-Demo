/*Create a custom exception class MyException, this exception is throw when user enter
"0" as integer input.
 */

package Program1;
public class MyException extends Exception{
    public MyException(String message){
        super(message);
    }

}
