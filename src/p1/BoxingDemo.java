package p1;

public class BoxingDemo {
    public static void main(String[] args) {
        new BoxingDemo().f1();
    }

    private void f1() {

        long l1=24424242;
        Long l2=Long.valueOf(l1); // Boxing

        String s="10";
        Long l=Long.parseLong(s); // To Convert from String into Long

    }
}
