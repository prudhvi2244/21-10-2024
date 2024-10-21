package p1;

public class StringReverse {
    public static void main(String[] args) {
        new StringReverse().f1();
    }

    private void f1() {
        String s1="reverse";
        String s2="";
        for (int i=s1.length()-1;i>=0;i--) {
            s2=s2+s1.charAt(i);
        }
        System.out.println("Actual String :"+s1);
        System.out.println("Reversed String :"+s2);

    }
}
