import java.util.*;
import com.ssuriyan.java.programs.AnagramCheck;
import com.ssuriyan.java.programs.crackingthecodinginterview.*;

public class ScratchPad {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String input;
        System.out.print("Input string: ");
        input = s.nextLine();
        System.out.println(URLify.urlify(input));
    }
}