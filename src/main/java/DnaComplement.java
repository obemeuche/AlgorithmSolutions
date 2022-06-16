import java.util.Arrays;

public class DnaComplement {

//    In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G".
//
//    Your function receives one side of the DNA (string, except for Haskell); you need to return the other complementary side.
//
//    DNA strand is never empty or there is no DNA at all (again, except for Haskell).

//    Example: (input --> output)
//
//            "ATTGC" --> "TAACG"
//            "GTAT" --> "CATA"

        public static String DnaComplement(String dna)
        {
            char [] newArr = dna.toCharArray();
            for (int i = 0; i < dna.length(); i++) {
                if (newArr[i] == 'A') {
                    newArr[i] = 'T';
                }
                else if (newArr[i] == 'T') {
                    newArr[i] = 'A';
                }
                else if (newArr[i] == 'C') {
                    newArr[i] = 'G';
                }
                else if (newArr[i] == 'G') {
                    newArr[i] = 'C';
                }
            }


                    // OR

//            char[] charArray = dna.toCharArray();
//
//            for (int i = 0; i < dna.length(); i++)
//            {
//                switch (charArray[i])
//                {
//                    case 'A': charArray[i] = 'T'; break;
//                    case 'T': charArray[i] = 'A'; break;
//                    case 'C': charArray[i] = 'G'; break;
//                    case 'G': charArray[i] = 'C'; break;
//                }
//            }
//
//            return new String(charArray);
            return new String(newArr);
        }

    public static void main(String[] args) {
        System.out.println(DnaComplement("ATCG"));
    }
}
