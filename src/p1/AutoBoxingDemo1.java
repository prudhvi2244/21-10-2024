package p1;

public class AutoBoxingDemo1 {
    public static void main(String[] args) {
        new AutoBoxingDemo1().f1();
    }

    private void f1() {
        int i1=10;
        Integer i2=i1; // AutoBoxing
    }
}
