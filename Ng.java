import java.util.Arrays;

public class Ng {

    public static boolean nameOfMethod (int a) {

        if (a>=-1 && a<=1) {
            return false;
        } else

      while ((a > 1) || (a < -1)){

                if (a % 2 == 0) {
                    a = a / 2;
                } else return false;
}           return true;
        }
    
public static int maxOfNumbers(int a, int b, int c, int d){

        int[] array = {a, b, c, d};

        return (Arrays.stream(array).max().getAsInt());

    }

 public static boolean ifPolindrom1(String word){

     String polindrom = word.replace("\\W", "");

     StringBuilder rev = new StringBuilder(polindrom);

     String mordnilop = rev.reverse().toString();

     return (polindrom.equalsIgnoreCase(mordnilop));
 }

    // 2й вариант сделала после митинга, подумав, что и правда можно разделить на 2 части)

     public static boolean ifPolindrom2(String word) {

        String poli = word.toLowerCase().replace("\\W", "");

        for (int i = 0; i < poli.length() / 2; i++) {
            if (poli.charAt(i) != poli.charAt(poli.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    public static int[] multiArray(int[] initialArray) {

        int[] newArray = new int[initialArray.length];
        for (int i = 0; i < initialArray.length; i++) {
            int result = 1;

            for (int j = 0; j < initialArray.length; j++) {
                if (i == j) continue;
                result = result * initialArray[j];
            }

            newArray[i] = result;
        }
        return newArray;
    }

    public static ArrayList<Integer> devide(int[] arrays) {

        ArrayList<Integer> result = new ArrayList<Integer>();

        int one = 0;
        int two = 0;

        int cutOne = 0;
        int cutTwo = 0;

        for (int element : arrays) {

            if (element == 0) {
                one++;
            } else two++;

        }

        for (int i = 0; i < arrays.length; i++) {

            if (arrays[i] == 0) {
                cutOne++;
                if (cutOne > one / 2) {
                    result.add(i);
                    cutOne = 1;
                    cutTwo = 0;
                }
            } else {
                cutTwo++;
                if (cutTwo > two / 2) {
                    result.add(i);
                    cutTwo = 1;
                    cutOne =0;
                }
            }
            }
        return result;
    }
    }

public static String romanSum(String one, String two) {

        String[] roman = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        int[] arabic = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int a = 0;
        int b = 0;
        int result = 0;
        String prefix = "";

        if (isNumeric(one) && isNumeric(two)) {
            result =  Integer.parseInt(one) + Integer.parseInt(two);
            return prefix+result;
        } else {

            for (int i = 0; i < roman.length; i++) {

                if (one.equals(roman[i])) {
                    a = arabic[i];
                }

                if (two.equals(roman[i])) {
                    b = arabic[i];
                }
            }

        }
        result = a + b;
        if (result==0){
            System.out.println("Something went wrong");
        } else if (result > 10) {
            result = result - 10;
            prefix = "X";
        }

        for (int i = 0; i < arabic.length; i++) {

            if (result == arabic[i]) {
                prefix += roman[i];
            }
        }
        return prefix;
    }


    public static boolean isNumeric(String string) {

        if (string == null || string.equals("")) {
            return false;
        }

        try {
            Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {

        }
        return false;
    }


}

    public static void main(String[] args) {

        System.out.println(ifPolindrom("А роза упала на лапу Азора"));

//        int[] array = {100, 7, 8,19, 175};
//
//        System.out.println(maxOfNumbers(array));

//        System.out.println(nameOfMethod(0));
//        System.out.println(nameOfMethod(2));
//        System.out.println(nameOfMethod(256));
//        System.out.println(nameOfMethod(300));
//        System.out.println(nameOfMethod(1));
//        System.out.println(nameOfMethod(3));
//        System.out.println(nameOfMethod(-777));
//        System.out.println(nameOfMethod(-256));
//        System.out.println(nameOfMethod(-2));
//        System.out.println(nameOfMethod(1111));
//        System.out.println(nameOfMethod(-1));
    }
    }

