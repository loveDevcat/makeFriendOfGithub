import org.junit.Test;


import java.util.*;


public class ApplesAndOrangesWithoutGenerics {

    public static void main(String[] agrs){
        LinkedList<Apple> apples = new LinkedList<Apple>();

        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }
//        apples.add(new Orange());
        Deque<String> stack = new ArrayDeque<>();
        String str = "My dog has fleas";

        for(String s : "My dog has fleas".split(" "))
            stack.push(s);
        while(!stack.isEmpty())
            System.out.print(stack.pop() + " ");

    }



}

class Apple {
    private static long count;
    private final long id = count++;
    public long id(){return this.id;}
}
class Orange {

}

