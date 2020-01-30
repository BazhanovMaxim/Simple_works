public class Main {
    public static void main(String[] args) {

        String s1 = "aretheyhere";
        String s2 = "yestheyarehere";
        System.out.println(TwoToOne.longest(s1, s2));

    }
}

class TwoToOne {
    public static String longest (String s1, String s2) {
        String[] Alphabet = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o",
                "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        String word = s1 + s2;
        StringBuilder builder = new StringBuilder();

        for (String i : Alphabet){
            int index_element = word.indexOf(i);
            System.out.println("index: " + index_element + " element: " + i);
            if (index_element > -1) builder.append(i);
        }

        return builder.toString();
    }
}