import java.util.Arrays;

public class DnaComplement {
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
