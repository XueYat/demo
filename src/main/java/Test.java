import java.util.ArrayList;
import java.util.List;

/**
 * @author YatXue
 * @date 2019/6/6 19:13
 */
public class Test {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = (a + b) * 10;
        Test test = new Test();
        test.math(c);
    }

    public void math(int num){
        System.out.println(num);
    }
}
