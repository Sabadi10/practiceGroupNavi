package SimonaTasks.uniqueElements;

public class UniqueCharacters {

    public static void main(String[] args) {

        uniqueCharacters("AASDDDRBBBV");

    }


    public static void uniqueCharacters(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char current = str.charAt(i);

            if (str.indexOf(current) == str.lastIndexOf(current)) {
                result += (current);
            }
        }
        System.out.println(result);

    }

}




