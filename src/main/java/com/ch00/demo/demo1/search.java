package com.ch00.demo.demo1.Demo;

public class search {
    int[] list = new int[]{1 , 3 , 5 , 7 , 9 , 11 , 13};
    int key = 6;
    int low = 0, high = list.length - 1;
    int middle = 0;

    public int search(){
        if(key < list[low] || key > list[high] || low > high){
            return -1;
        }
        while (low <= high){
            middle = (low + high) / 2;
            if (list[middle] > key) {
                high = middle - 1;
            } else if (list[middle] < key) {
                low = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        search s = new search();
        System.out.println(s.search());
    }
}
