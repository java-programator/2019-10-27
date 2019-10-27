package pl.altkom.inners;

interface Foo {
    int f(int x, int y);
}
interface  Bar {
    double f(double a, double b);
}
interface ZeSlajdu {
    void f(String msg);
}
class FooImpl implements Foo {
    @Override
    public int f(int x, int y) {
        int max = x > y ? x : y;
        return max;
    }
}
public class Example04 {
    public static void main(String[] args) {
        Foo f1 = new FooImpl();
        Foo f2 = new Foo() {
            @Override
            public int f(int x, int y) {
                int max = x > y ? x : y;
                return max;
            }
        };
        Foo f3 = (x, y) -> {
            int max = (x > y) ? x : y;
            return max;
        };
        Foo f4 = (x, y) -> {return (x > y) ? x : y;};
        Foo f5 = (x, y) -> (x > y) ? x : y;
        Bar b1 = (x, y) -> (x > y) ? x : y;

        System.out.println(f4.f(6,7));
        System.out.println(f4.toString());
    }
}
