public class Converter {

    public String convert(int number) {
        StringBuilder result = new StringBuilder();
        int[] values = {10, 5, 1};
        String[] numerals = {"X", "V", "I"};

        for (int i = 0; i < values.length; i++) {
            while (number >= values[i]) {
                number -= values[i];
                result.append(numerals[i]);
            }
        }

        return result.toString();
    }
}