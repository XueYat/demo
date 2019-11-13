package com.ch02.objectoriented.ch02;

/**
 * @author YatXue
 * @date 2019/3/18 9:56
 */
public class SearchStuTest {
    public static void main(String[] args) {
        String[] stuNames = {"张三", "李四", "王五", "赵六", "田七"};
        String stuName = "赵六";
        SearchStu searchStu = new SearchStu();
        searchStu.searchStuName(stuNames, stuName);

    }
}
