package test.string;

/**
 * Write the code. Change the world.
 *
 * @author rsyan
 * Created on 2022-06-05
 */
public class Equal implements Cloneable{
    public static void main(String[] args) {
        test1();

    }
    public static void test1() {
        System.out.println(Math.ceil(11.3));
        System.out.println(Math.ceil(-11.3));

        System.out.println(Math.floor(11.3));
        System.out.println(Math.floor(-11.3));

        System.out.println(Math.round(12.5));
        System.out.println(Math.round(-12.5));
    }

    protected void test() {
        System.out.println("test");
    }


    public static void test0() {
        String test1 = new String("test1");
        String test11 = new String("test1");
        System.out.println(test1.equals(test11));
        Integer a = 1;
        Integer b = 1;
        System.out.println(a.equals(b));

        VariantTest variantTest = new VariantTest();
        VariantTest variantTest1 = new VariantTest();
        System.out.println(variantTest.equals(variantTest1));

        Integer c = null;
        System.out.println(c);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}


