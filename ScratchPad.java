import java.util.*;
import com.ssuriyan.java.programs.AnagramCheck;
import com.ssuriyan.java.programs.crackingthecodinginterview.UniqueCharacters;

public class ScratchPad {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String input;
        System.out.print("Input string: ");
        input = s.nextLine();

        boolean res = UniqueCharacters.checkUniqueChars(input);
        if (res) {
            System.out.println("\nAll characters of input string are unique.");
        } else {
            System.out.println("\nAll characters of input string are not unique.");
        }
    }
}