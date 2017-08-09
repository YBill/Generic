import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bill on 2017/8/9.
 */
public class JavaTest1 {
    static class A {
    }

    static class B extends A {
    }

    static void copy(List<? extends A> from, List<? super A> to) {
        for (int i = 0; i < from.size(); i++) {
            to.set(i, from.get(i));
        }
    }

    public static void main(String[] args) {
        List<A> listA = new ArrayList<>();
        List<B> listB = new ArrayList<>();
        copy(listB, listA);


        List<A> list = new ArrayList<>();
        A a = new A();
        B b = new B();
        list.add(a);
        list.add(b);

        System.out.println(list.size());


    }

}