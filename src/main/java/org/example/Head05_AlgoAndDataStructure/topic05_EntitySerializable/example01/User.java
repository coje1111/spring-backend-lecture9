package org.example.Head05_AlgoAndDataStructure.topic05_EntitySerializable.example01;

import java.io.Serializable;
// Serializable 인터페이스 - 직렬화 가능 표시
public class User implements Serializable {
    // 직렬화 버전 UID
    // 클래스 구조가 변경되어도 호환성을 유지할것을 명시
    private static final long serialVersionUID = 1L;

    private String name;
    private int age;

    // transient 키워드를 사용하면 직렬화에서 제외
    // private transient String password; // 비밀번호는 직렬화 시키지 않을 것을 가정

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
