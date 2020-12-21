public class FizzBuzz {

    public static final int MIN_NUMBER = 1;
    public static final int SO_NHO_NHAT_CO_2_CHU_SO = 10;
    public static final int SO_LON_NHAT_CO_2_CHU_SO = 99;

    static String fizzBuzz(int number){
        String result = "";
        String str = String.valueOf(number);
        if ( isFizz(number) && isBuzz(number)){
            result = "FizzBuzz";
        } else if (isBuzz(number)){
            result = "Buzz";
        } else if (isFizz(number)){
            result = "Fizz";
        } else if (Have3(str)) {
            result =  "Fizz";
        }
        else if (Have5(str)) {
            result = "Buzz";
        }
        else {
            if (number >= MIN_NUMBER && number < SO_NHO_NHAT_CO_2_CHU_SO){
                result = docSoNhoHon10(number, result);
            } else if ( number >= SO_NHO_NHAT_CO_2_CHU_SO && number <= SO_LON_NHAT_CO_2_CHU_SO){
                result = docSoLonHon10NhoHon100(number, result);
            } else
                result = String.valueOf(number);
        }
        return result;
    }

    private static String docSoLonHon10NhoHon100(int number, String result) {
        char hangchuc = String.valueOf(number).charAt(0);
        char hangdonvi = String.valueOf(number).charAt(1);
        String result1 = getResult(result, hangchuc);
        String result2 = getResult(result, hangdonvi);
        result = result1 + " " +  result2;
        return result;
    }

    private static String docSoNhoHon10(int number, String result) {
        char char1 = String.valueOf(number).charAt(0);
        result = getResult(result, char1);
        return result;
    }

    private static String getResult(String result, char char1) {
        switch (char1){
            case '0':
                result = "Khong";
                break;
            case '1':
                result = "Mot";
                break;
            case '2':
                result = "Hai";
                break;
            case '3':
                result = "Ba";
                break;
            case '4':
                result = "Bon";
                break;
            case '5':
                result = "Nam";
                break;
            case '6':
                result = "Sau";
                break;
            case '7':
                result = "Bay";
                break;
            case '8':
                result = "Tam";
                break;
            case '9':
                result = "Chin";
                break;
        }
        return result;
    }


    private static boolean isBuzz(int number) {
        return number % 5 == 0;
    }

    private static boolean isFizz(int number) {
        return number % 3 == 0;
    }

    private static boolean Have5(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '5') {
                return true;
            }
        }
        return false;
    }

    private static boolean Have3(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '3') {
                return true;
            }
        }
        return false;
    }
}
