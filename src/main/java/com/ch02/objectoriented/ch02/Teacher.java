package com.ch02.objectoriented.ch02;

/**
 * @author YatXue
 * @date 2019/3/18 14:04
 */
public class Teacher {
    public void upScore(Student[] students){
        for (int i = 0; i < students.length; i++) {
            if (students[i].score < 60){
                students[i].score += 2;
            }
        }
    }
}
