package com.ch03.advancedfeatures.ch07;

import cn.kgc.pojo.User;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/**
 * @author YatXue
 * @date 2019/6/22 11:03
 */
public class Sequence implements Serializable {
    public static void main(String[] args) {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("d:/user.txt"));
            User user = (User) objectInputStream.readObject();
            objectInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
