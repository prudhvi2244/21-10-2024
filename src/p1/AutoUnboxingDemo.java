package p1;

public class AutoUnboxingDemo {
    public static void main(String[] args) {
        new AutoUnboxingDemo().f1();
    }

    private void f1() {
        Integer i1=new Integer(10);
        int i2=i1; // AutoUnboxing
    }
}
