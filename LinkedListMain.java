import java.util.*;
import com.ssuriyan.java.programs.LinkedList;

/*
 * @author SURIYAN S (suriyansub710@gmail.com)
 */

public class LinkedListMain {
    public static void main(String args[]) {

        int length;
        Scanner scan = new Scanner(System.in);
        LinkedList newList = new LinkedList();
        
        System.out.print("LinkedList's length: ");
        length = scan.nextInt();

        for(int i = 0; i < length; i++) {
            System.out.print("Enter a number: ");
            int val = scan.nextInt();
            newList.add(val);
        }
        
        newList.print();

        newList.remove(1);
    }
}