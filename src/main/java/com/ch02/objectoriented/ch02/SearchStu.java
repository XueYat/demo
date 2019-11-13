package com.ch02.objectoriented.ch02;

/**
 * @author YatXue
 * @date 2019/3/18 9:54
 */
class SearchStu {
    void searchStuName(String[] stuNames, String stuName){
        boolean flag = false;
        for (String name:
                stuNames) {
            if (name.equals(stuName)){
                flag = true;
                System.out.println(stuName + "存在");
            }
        }
        if (!flag) {
            System.out.println(stuName + "不存在");
        }
    }
}
