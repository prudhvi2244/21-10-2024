package p1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo2 {
    public static void main(String[] args) {
        new RegularExpressionDemo2().f1();
    }

    private void f1() {
        String target="Learning Java 123#@.";
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9\\s\\.]");
        Matcher matcher = pattern.matcher(target);


        while(matcher.find()) {
            System.out.println("Match Found at start index : "+matcher.start() +" End Index : "+matcher.end()+" Matched String :"+matcher.group());
        }

    }
}
