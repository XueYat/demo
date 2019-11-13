package designpatterns.atamplatemethod;

/**
 * 模板
 * @author YatXue
 * @date 2019/7/2 8:09
 */
public class Cook extends Cooking {
    @Override
    void serve() {
        System.out.println("茄子");
    }

    @Override
    void seasoning() {
        System.out.println("十三香");
    }

    public static void main(String[] args) {
        Cook cook = new Cook();
        cook.cooking();
    }
}
