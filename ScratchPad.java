import java.util.*;
import com.ssuriyan.java.programs.*;
import com.ssuriyan.java.programs.crackingthecodinginterview.*;

public class ScratchPad {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String input;
        System.out.print("Input string: ");
        input = s.nextLine();
        boolean result = PermutationPalindrome.isPermutationPalindrome(input);
        if (result) {
            System.out.println("Input's permutation can be a palindrome!");
        } else {
            System.out.println("Input's permutation cannot be a palindrome!");
        }
    }
}