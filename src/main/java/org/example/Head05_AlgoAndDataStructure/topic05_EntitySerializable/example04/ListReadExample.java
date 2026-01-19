package org.example.Head05_AlgoAndDataStructure.topic05_EntitySerializable.example04;

import org.example.Head05_AlgoAndDataStructure.topic05_EntitySerializable.example01.User;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class ListReadExample {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user.ser"))) {
            // 제네릭 타입 캐스팅 -> 안전성 경고가 나옴
            // @SuppressWarnings("unchecked")
            List<User> loadedList = (List<User>) ois.readObject();
            System.out.println("역직렬화된 리스트:");
            for (User user : loadedList) {
                System.out.println(user);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
