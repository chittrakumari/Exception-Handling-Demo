
/*Program to demonstrate custom excetion.Exception will be thrown when a user enters a
 number less than 100;
 */

package CustomException;
public class CustomExceptionClass extends Exception {
    public CustomExceptionClass(String message){
        super(message);
    }
}
