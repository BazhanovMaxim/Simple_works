public class Main {

    public static void main(String[] args) {

        int count = getCount("abracadabra12 az");
        System.out.println(count);
    }

    public static int getCount(String str) {

        return (str.replaceAll("(?i)[qwrtpsdfghjklzxcvbnmy1234567890 ]" , "").length());

        //return str.replaceAll("(?i)[^aeiou]", "").length();
    }
}
