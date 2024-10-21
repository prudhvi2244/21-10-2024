package p1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo1 {
    public static void main(String[] args) {
        new RegularExpressionDemo1().f1();
    }

    private void f1() {
        String target="Hello World,How are you?wyyyytytwenty";
        Pattern pattern = Pattern.compile("y+");
        Matcher matcher = pattern.matcher(target);


        while(matcher.find()) {
            System.out.println("Match Found at index : "+matcher.start() +" End Index : "+matcher.end()+" Matched String :"+matcher.group());
        }

    }
}
