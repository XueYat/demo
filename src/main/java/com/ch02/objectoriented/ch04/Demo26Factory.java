package com.ch02.objectoriented.ch04;

/**
 * @author YatXue
 * @date 2019/3/25 14:17
 */
public class Demo26Factory {
    Demo26Goods getPrice(String str){
        if ("tvs".equals(str)) {
            return new Demo26TVs();
        }else {
            return new Demo26Foods();
        }
    }
}
