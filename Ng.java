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
 public static int maxOfNumbers(int[]numbers){

     return (Arrays.stream(numbers).max().getAsInt());

 }

 public static boolean ifPolindrom1(String word){

     String polindrom = word.replace(" ", "");

     StringBuilder rev = new StringBuilder(polindrom);

     String mordnilop = rev.reverse().toString();

     return (polindrom.equalsIgnoreCase(mordnilop));
 }

    // 2й вариант сделала после митинга, подумав, что и правда можно разделить на 2 части)

     public static boolean ifPolindrom2(String word) {

        String poli = word.toLowerCase().replace(" ", "");

        for (int i = 0; i < poli.length() / 2; i++) {
            if (poli.charAt(i) != poli.charAt(poli.length() - 1 - i)) {
                return false;
            }
        }

        return true;
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

