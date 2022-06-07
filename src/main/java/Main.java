import java.util.ArrayList;

public class Main {
    public static int arrayPacking(ArrayList<Integer> integers) {
        int decimal = 0;
        String pack = "";
        String binary = "";
        StringBuilder numZero = new StringBuilder();
        for (int i = integers.size() - 1; i >= 0; i--) {
            binary = Integer.toBinaryString(integers.get(i));
            if(binary.length() < 8) {
                int diff = 8 - binary.length();
                for (int j = 0; j < diff; j++) numZero.append("0");
            }
            binary = numZero + binary;
            pack = pack + binary;
        }
        decimal = Integer.parseInt(pack, 2);
        return decimal;
    }
}
