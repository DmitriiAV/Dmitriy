package Generic;

public class Something<A,B /*extends Integer*/> {
    private A a;
    private B b;

    public Something(A a, B b) {
        this.a=a;
        this.b=b;
    }

    public void likeString() {
        System.out.println(a.toString()+" "+b.toString());
    }
    public void likeInt() {
        if (a instanceof Integer && b instanceof Integer) {
            System.out.println(Integer.parseInt(a.toString()) + Integer.parseInt(b.toString()));
        }
    }

}
