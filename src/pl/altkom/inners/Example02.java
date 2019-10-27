package pl.altkom.inners;

class Outer02 {
    public int x;

    class Inner {
        public int x;

        public  void foo() {
            System.out.println(x);
        }
    }
}

public class Example02 {
    public static void main(String[] args) {
        Outer02 o = new Outer02();
        Outer02.Inner i = o.new Inner();
    }
}
