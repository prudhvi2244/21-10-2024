package p1;

public class StringBufferDemo1 {

    public static void main(String[] args) {
        new StringBufferDemo1().f1();
    }

    private void f1() {
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer(100);
        String s=new String("welcome to string buffer");
        StringBuffer sb3 = new StringBuffer(s);

        System.out.println("Length of StringBuffer sb1 is: "+sb1.length());
        System.out.println("Capacity of StringBuffer sb1 is: "+sb1.capacity());

        System.out.println("*********************************************************");

        System.out.println("Capacity of StringBuffer sb2 is: "+sb2.capacity());
        System.out.println("Length of StringBuffer sb2 is: "+sb2.length());

        System.out.println("*********************************************************");

        System.out.println("Capacity of StringBuffer sb3 is: "+sb3.capacity());
        System.out.println("Length of StringBuffer sb3 is: "+sb3.length());

        System.out.println("Character at index position '1' is :"+sb3.charAt(1));

        sb3.setCharAt(1, 'z'); // Replacement
        System.out.println(sb3);

        sb3.insert(1,'A'); // Inserting new element by shifting old element to next index

        System.out.println(sb3);

        sb3.append(" it is mutable");
        System.out.println(sb3);


        sb3.delete(0,6);
        System.out.println(sb3);

        sb3.deleteCharAt(0);

        char ch[]=new char[]{'A','B','C'};
        sb3.insert(0,ch);
        System.out.println(sb3);

        StringBuffer sb4=new StringBuffer("madam");
        sb4.reverse();
        System.out.println(sb4);

    }
}
