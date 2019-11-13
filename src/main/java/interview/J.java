package interview;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

/**
 * @author YatXue
 * @date 2019/10/21 8:02
 */
public class J {
    @Test
    public void j() {
        int j = 0;
        for (int i = 0; i < 100; i++) {
            j = j++;
        }
        System.out.println(j);

        ArrayList<String> list = new ArrayList<String>();
        list.add("this is list");
        Vector<String> vector = new Vector<String>();
        vector.add("this is list");
        System.out.println(list.equals(vector));
        test(1, 1);
    }

    public static void test(int a, int b) {
        System.out.println(a == b ? 9.9 : 9);
        System.out.println(a == b ? 'a' : 98);
        System.out.println(a == b ? 'a' : Integer.MAX_VALUE);
        System.out.println(a == b ? 'a' : b);
        System.out.println(a != b ? 'a' : b);

        Map<String, Long> map = new HashMap<>();
        map.put("b", 1L);
        System.out.println(map == null ? -1L : null);
        System.out.println(map == null ? Long.valueOf(-1) : map.get("a"));
        System.out.println(map == null ? -1L : map.get("a"));
    }
}
