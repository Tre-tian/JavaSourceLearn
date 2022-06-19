package test.string;

/**
 * Write the code. Change the world.
 *
 * @author rsyan
 * Created on 2022-06-05
 */
public class TestProtected {

    public static void main(String[] args) throws CloneNotSupportedException {
        Equal equal = new Equal();
        Object clone = equal.clone();
        System.out.println(clone);

    }


}
