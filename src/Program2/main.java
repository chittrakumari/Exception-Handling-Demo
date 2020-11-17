/*A program to demonstrate custom exception.Create an integer array of size 5. And initialize it
with some values. Create a public boolean search(int[] arr, int searchElement), this method will
 return true if searchElement is present in array or else will throw an user defined exception
 NoElementFoundException.
 */

package Program2;
import java.util.*;
public class main {
    public static void main(String[] args) {
        main object = new main();
        int i, ele;
        Scanner obj = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("enter 5 elements");
        for (i = 0; i < 5; i++) {
            arr[i] = obj.nextInt();
        }

        System.out.println("enter your search element");
        ele = obj.nextInt();

        try {
            object.search(arr, ele);
        } catch (ArrayException e) {
            System.out.println("NoElementFoundException");
        }
    }

    public boolean search(int[] a, int searchElement) throws ArrayException {
        int c = 0, f = 0;
        for (int i = 0; i < 5; i++) {
            if (a[i] == searchElement) {
                f = 1;
                break;
            }
        }

        if (f == 1) {
            return true;
        } else
            throw new ArrayException("NoElementFoundException");
    }
}