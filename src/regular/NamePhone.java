package regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NamePhone {
    public static void main(String[] args) {
        String number = "840969696411";
        Pattern pattern = Pattern.compile("^84[0-9]{10}");
        Matcher matcher = pattern.matcher(number);
        System.out.println(matcher.matches());
    }
}
