package test.string;

import java.util.Objects;

/**
 * Write the code. Change the world.
 *
 * @author rsyan
 * Created on 2022-06-05
 */
public class VariantTest {
    public static int staticVar = 0;
    public int instanceVar = 0;

    public VariantTest() {
        staticVar++;
        instanceVar++;
        System.out.println("staticVar=" + staticVar + ",instanceVar=" + instanceVar);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VariantTest that = (VariantTest) o;
        return instanceVar == that.instanceVar;
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceVar);
    }
}
