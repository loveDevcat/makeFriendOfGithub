import java.util.ArrayList;

public class ApplesAndOrangesWithoutGenerics {
    public static void main(String[] agrs){
        ArrayList apples = new ArrayList();
    }
}

class Apple {
    private static long count;
    private final long id = count++;
    public long id(){return this.id;}
}
class orange{

}

