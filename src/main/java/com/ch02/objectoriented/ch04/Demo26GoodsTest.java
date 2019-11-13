package com.ch02.objectoriented.ch04;

/**
 * @author YatXue
 * @date 2019/3/25 14:10
 */
public class Demo26GoodsTest {
    static void show(Demo26Goods demo26Goods){
        demo26Goods.info();
    }

    public static void main(String[] args) {
        Demo26Goods demo26Goods = new Demo26Goods();
        Demo26TVs demo26TVs = new Demo26TVs();
        Demo26Foods demo26Foods = new Demo26Foods();
        Demo26Factory demo26Factory = new Demo26Factory();
        show(demo26Goods);
        show(demo26TVs);
        show(demo26Foods);
        Demo26Goods demo26Goods1 = demo26Factory.getPrice("tvs");
        Demo26Goods demo26Goods2 = demo26Factory.getPrice("foods");
        demo26Goods1.info();
        demo26Goods2.info();
    }
}
