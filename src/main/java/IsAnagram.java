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
    public boolean isAnagram(String s, String t) {

        String [] newAr = s.split("");
        String [] newArr = t.split("");

        Arrays.sort(newAr);
        Arrays.sort(newArr);

        if (Arrays.equals(newAr,newArr)) {
            return true;
        }
        else return false;
    }
}

        // OR //

    class Solution2 {
        public boolean isAnagram(String s, String t) {

            char [] newAr = s.toCharArray();
            char [] newArr = t.toCharArray();

            String sortedS = "";
            String sortedT = "";

            Arrays.sort(newAr);
            Arrays.sort(newArr);

            sortedS = (Arrays.toString(newAr));
            sortedT = (Arrays.toString(newArr));

            if (sortedS.contains(sortedT)) {
                return true;
            }
            else return false;
        }
    }
}
