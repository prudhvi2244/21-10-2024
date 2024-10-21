package p1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidationDemo {
    public static void main(String[] args) {
        new EmailValidationDemo().f1();
    }

    private void f1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Email :");
        String email = sc.next();

        Pattern pattern=Pattern.compile("^[\\w#$\\.-]+@[a-zA-Z]+[.][a-zA-Z]{2,}([.][a-zA-Z]{2,})?$");
        Matcher matcher=pattern.matcher(email);

        if(matcher.matches()) {
            System.out.println("Email is valid");
        }
        else{
            System.out.println("Email is not valid");
        }


    }
}
