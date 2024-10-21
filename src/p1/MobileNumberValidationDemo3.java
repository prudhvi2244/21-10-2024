package p1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumberValidationDemo3 {
    public static void main(String[] args) {
        new MobileNumberValidationDemo3().f1();
    }

    private void f1() {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your mobile number: ");
        String mobileNumber=sc.next();

        Pattern pattern=Pattern.compile("^(91|0)?[6789][\\d]{9}$");
        Matcher matcher=pattern.matcher(mobileNumber);

        if(matcher.find() && matcher.group().equals(mobileNumber)) {
            System.out.println("Mobile number is valid");
        }
        else{
            System.out.println("Mobile number is not valid");
        }

    }
}
