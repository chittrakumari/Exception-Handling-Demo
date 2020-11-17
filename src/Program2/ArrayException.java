/*A program to demonstrate custom exception.Create an integer array of size 5. And initialize it
with some values. Create a public boolean search(int[] arr, int searchElement), this method will
 return true if searchElement is present in array or else will throw an user defined exception
 NoElementFoundException.
 */

package Program2;
public class ArrayException extends Exception{
    public ArrayException(String message){
        super(message);
    }
}
