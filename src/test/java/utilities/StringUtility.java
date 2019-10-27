package utilities;

public class StringUtility {
    public static void verifyEquals(String expected,String actual){

        /*
        The method prints `PASS` if both strings are equals to each other.
        Else it prints `FAIL` and it also prints the values of both arguments.
         */
        String result = (expected==actual)? "PASS": "FAIL";
        System.out.println(result);
    }
}
