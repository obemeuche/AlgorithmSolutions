public class DecompressString {

    public static void main(String[] args) {
        String input = "A2bf3C5e1";
        String output = decompressString(input);

        System.out.println(output);
    }

    //input - A4b3C2
    //output - AAAAbbbCC

    public static String decompressString(String input) {
        //initialize a string builder variable
        StringBuilder output = new StringBuilder();

        //iterate the input string
        for (int i = 0; i < input.length(); i++)
        {
            //get the first character of the string
            char c = input.charAt(i);
            //check if it is a letter
            if(Character.isLetter(c))
            {
                int count = 0;
                //check if the next character is a digit
                if(Character.isDigit(input.charAt(i + 1)))
                {
                    //get the numeric value of the digit into a count variable
                    count = Character.getNumericValue(input.charAt(i + 1));
                }
//                else {
//                    count = 1;
//                }
                //loop through the count variable and append the character value
                //a for loop here will suffice
                output.append(String.valueOf(c).repeat(Math.max(0, count)));
            }
        }
        return output.toString();
    }
}
