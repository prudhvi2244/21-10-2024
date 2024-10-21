package p1;

public class StringBuilderDemo1 {

    public static void main(String[] args) {
        new StringBuilderDemo1().f1();
    }

    private void f1() {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder(100);
        String s=new String("welcome to string buffer");
        StringBuilder sb3 = new StringBuilder(s);

        System.out.println("Length of StringBuilder sb1 is: "+sb1.length());
        System.out.println("Capacity of StringBuilder sb1 is: "+sb1.capacity());

        System.out.println("*********************************************************");

        System.out.println("Capacity of StringBuilder sb2 is: "+sb2.capacity());
        System.out.println("Length of StringBuilder sb2 is: "+sb2.length());

        System.out.println("*********************************************************");

        System.out.println("Capacity of StringBuilder sb3 is: "+sb3.capacity());
        System.out.println("Length of StringBuilder sb3 is: "+sb3.length());

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

        StringBuilder sb4=new StringBuilder("madam");
        sb4.reverse();
        System.out.println(sb4);

    }
}
