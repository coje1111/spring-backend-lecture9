package org.example.Head05_AlgoAndDataStructure.topic05_EntitySerializable.example03;

import org.example.Head05_AlgoAndDataStructure.topic05_EntitySerializable.example01.User;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ListWriteExample {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        userList.add(new User("kim", 25));
        userList.add(new User("Lee", 25));
        userList.add(new User("Park", 25));

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("users.ser"))) {
            oos.writeObject(userList); // 리스트 자체를 직렬화
            System.out.println("리스트 직렬화 완료: user.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
