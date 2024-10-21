package p1;

public class UnBoxingDemo {
    public static void main(String[] args) {

        new  UnBoxingDemo().f1();

    }

    private void f1() {
        Integer i1=new Integer(10);
        int i2=i1.intValue(); // UnBoxing
    }
}
