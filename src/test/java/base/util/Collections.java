package test.java.base.util;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

/**
 * Write the code. Change the world.
 *
 * @author rsyan
 * Created on 2022-04-19
 */
public class Collections {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 2);
        integerList.add(2);

        System.out.println(integerList.stream().limit(2).count());

    }
}
