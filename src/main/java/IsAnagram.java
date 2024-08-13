import java.util.Arrays;

public class IsAnagram {
//    Given two strings s and t, return true if t is an anagram of s, and false otherwise.

//An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
// typically using all the original letters exactly once.

//Example 1:
//
//Input: s = "anagram", t = "nagaram"
//Output: true
//Example 2:
//
//Input: s = "rat", t = "car"
//Output: false
//
//
//Constraints:
//
//1 <= s.length, t.length <= 5 * 104
//s and t consist of lowercase English letters.

class Solution {
    static boolean isAnagram(String s, String t) {

        //convert to string array
        String [] newAr = s.split("");
        String [] newArr = t.split("");

        //sort arrays
        Arrays.sort(newAr);
        Arrays.sort(newArr);

        //use the Array.equals method to compare both arrays
        return Arrays.equals(newAr, newArr);
    }
}

        // OR //

    class Solution2 {
        static boolean isAnagram2(String s, String t) {

            //convert to character array
            char [] newAr = s.toCharArray();
            char [] newArr = t.toCharArray();

            Arrays.sort(newAr);
            Arrays.sort(newArr);

            return Arrays.equals(newAr, newArr);
        }
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        System.out.println(Solution2.isAnagram2(s, t));
    }
}
