public class Main {

    public static void main(String[] args) {

        String str = "Hello world";
        str = disemvowel(str);
        System.out.println(str);
    }

    public static String disemvowel(String str) {

        // return str.replaceAll("(?i)[aeiou]" , "");
        // return str.replaceAll("[aAeEiIoOuU]", "");

        String[] array = new String[]{"a", "e", "i", "o", "u", "A", "E", "I", "O", "U"};

        for (String s : array) {
            int Sub = str.indexOf(s);
            str = str.replace(s, "");
        }

        return str;
    }

}
