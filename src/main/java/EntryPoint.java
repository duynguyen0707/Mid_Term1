import java.util.Locale;

public class EntryPoint {
    public static int countUpperCaseInString(String str) {
        int n = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                n++;
            }
        }
        return n;
    }

    public static String upperCaseAllFirstLetter(String str) {
        char[] array = str.toCharArray();
        array[0] = Character.toUpperCase(array[0]);

        for (int i = 1; i < array.length; i++) {
            if (Character.isWhitespace(array[i - 1])) {
                array[i] = Character.toUpperCase(array[i]);
            }
        }

        return new String(array);
    }

    public static String upperCaseFirstLetterAndAfterMaker(String str) {
        String s = str.toLowerCase();
        char[] array = s.toCharArray();

        for (int i = 1; i < array.length; i++) {
            array[0] = Character.toUpperCase(array[0]);

            if (Character.valueOf(array[i]) == '.') {
                array[i + 2] = Character.toUpperCase(array[i + 2]);
            }
        }

        return new String(array);
    }
}
