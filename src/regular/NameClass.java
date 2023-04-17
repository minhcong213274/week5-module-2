package regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameClass {
    public static void main(String[] args) {
        String string = "C02232G1";
        Pattern pattern = Pattern.compile("^[CAP][0-9]{4}[GHIK][0-9]$");
        Matcher matcher = pattern.matcher(string);
        System.out.println(matcher.matches());
    }
}
