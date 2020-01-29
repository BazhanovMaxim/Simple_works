public class Main {

    public static void main(String[] args) {

        String s = "man i need a taxi up to ubud";
        String result = high(s);
        System.out.println(result);

    }

    public static String high(String s) {

        String[] s_array = s.split(" ");

        String word = null;
        int count = 0;

        String[] Alphabet = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o",
                "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        for (String i : s_array) {
            int getCount_alphabet = 0;
            for (int q = 0; q < Alphabet.length; q++) {
                String patternRegex = "(?i)[^" + Alphabet[q] + "]";
                int test = i.replaceAll(patternRegex, "").length();
                getCount_alphabet = getCount_alphabet + (test * (q + 1));

                if (getCount_alphabet > 0 && getCount_alphabet > count) {
                    word = i;
                    count = getCount_alphabet;
                }

            }
        }

        if (word == null)
        {
            word = "";
        }
        return word;
    }
}