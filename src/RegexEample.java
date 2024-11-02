import java.util.regex.Pattern;

public class RegexEample {

    private static final Pattern VALID_PHONE_NUMBER_PATTERN = Pattern.compile("^(\\+998)((71|88|9[0134579])(\\d{7}))$");

    private static final Pattern VALID_PHONE_EMAIL_PATTERN = Pattern.compile("^(\\w+)@([\\w-]+)\\.(\\w{2,4})");

    private static final Pattern VALID_PHONE_PASSWORD_PATTERN = Pattern.compile("(?=.*[a-z]+)(?=.*[A-Z]+)(?=.*\\d+)(?=.*[!@#$%^&*]+).{8,20}");

    public static boolean isValidPhone(String input){
        if (input == null) {
            throw new RuntimeException();
        }
        return VALID_PHONE_NUMBER_PATTERN.matcher(input).matches();
    }

    public static boolean isValidEmail(String input){
        if (input == null) {
            throw new RuntimeException();
        }
        return VALID_PHONE_EMAIL_PATTERN.matcher(input).matches();
    }

    public static boolean isValidPassword(String input){
        if (input == null) {
            throw new RuntimeException();
        }
        return VALID_PHONE_PASSWORD_PATTERN.matcher(input).matches();
    }



}
