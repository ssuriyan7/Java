import java.util.*;
import com.ssuriyan.java.programs.AnagramCheck;

public class ScratchPad {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        String input1, input2;
        System.out.print("Input string: ");
        input1 = s.nextLine();
        System.out.print("Input string: ");
        input2 = s.nextLine();

        boolean res = AnagramCheck.checkAnagram(input1, input2);
        if (res) {
            System.out.println("\nInput strings are anagram.");
        } else {
            System.out.println("\nInput strings aren't anagram.");
        }
    }
}