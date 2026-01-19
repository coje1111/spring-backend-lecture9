package org.example.Head05_AlgoAndDataStructure.topic05_EntitySerializable.example01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectWriteExample {
    public static void main(String[] args) {
        User user = new User("Alice", 30);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user.txt"))) {
            oos.writeObject(user); // 객체를 파일로 저장
            System.out.println("직렬화 완료: user.ser");
            // oos.flush(); // 버퍼 강제 출력(권장)
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
