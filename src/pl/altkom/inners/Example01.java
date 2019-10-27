package pl.altkom.inners;

class Outer {
    public int x;
    static class Inner {
        public int x;

        public  void foo() {
            System.out.println(x);
        }
    }
}


public class Example01 {
    public static void main(String[] args) {
//        Outer o = new Outer();
        Outer.Inner i = new Outer.Inner();
    }
}
