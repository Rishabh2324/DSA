import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class AddTwoNumbers {

    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;
        else{
            a =a.toLowerCase();
            b =b.toLowerCase();
            char[] tempArray1 = a.toCharArray();
            char[] tempArray2 = a.toCharArray();
            Arrays.sort(tempArray1);
            Arrays.sort(tempArray2);
            return Arrays.equals(tempArray1,tempArray2);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}