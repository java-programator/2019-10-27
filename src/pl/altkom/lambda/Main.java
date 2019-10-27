package pl.altkom.lambda;

interface Foo{
    int f(int x, int y);
}

public class Main {

    public static void main(String[] args) {
        Foo f2 =new Foo() {
            @Override
            public int f(int x, int y) {
                int max = x > y ? x : y;
                return max;
            }
        };


        System.out.println(f2.f(3,5));

        Foo f3 = (x, y) -> x > y ? x : y;
        System.out.println(f3);
        System.out.println(f3.f(5,6));
    }
}
