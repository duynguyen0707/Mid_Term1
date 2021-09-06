import java.util.Locale;

public class EntryPoint {

    public static int countUpperCaseInString(String str) {

        int n = 0;

        for (int i = 0; i < str.length(); i++) {

            if (Character.isUpperCase(str.charAt(i))) {

                n += 1;
            }
        }

        return n;
    }

    // Viết in hoa toàn bộ chữ đầu của các từ trong chuỗi đó (VD: You Only Live Once. But If You Do It Right. Once Is Enough)

    public static String upperCaseAllFirstLetter(String str) {


        char[] arr = str.toCharArray();

        char fr = arr[0];

        char frUpper = Character.toUpperCase(fr);

        arr[0] = frUpper;


        for (int i = 0; i < arr.length; i++) {

            if (Character.isWhitespace(arr[i])) {

                char c = arr[i + 1];

                char inHoa = Character.toUpperCase(c);

                arr[i + 1] = inHoa;
            }

        }

        String result = String.valueOf(arr);

        return result;
    }


    public static String upperCaseFirsletterAfterPeriod(String str) {

        String str1 = str.toLowerCase();

        char[] arr = str1.toCharArray();

        char c = arr[0];

        char cUpperCase = Character.toUpperCase(c);

        arr[0] = cUpperCase;

        for (int i = 0; i < arr.length; i++) {

            if (Character.valueOf(arr[i]).equals('.')) {

                char c1 = arr[i + 2];

                char c1Upper = Character.toUpperCase(c1);

                arr[i + 2] = c1Upper;
            }

        }

        String result = String.valueOf(arr);

        return result;
    }


}
