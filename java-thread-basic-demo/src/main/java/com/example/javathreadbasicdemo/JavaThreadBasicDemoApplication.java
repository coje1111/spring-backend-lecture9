package com.example.javathreadbasicdemo;

import com.example.javathreadbasicdemo.practice04.RaceConditionDemo;

public class JavaThreadBasicDemoApplication {

  public static void main(String[] args) {

    System.out.println("Java Thread 기초와 동기화 실습 시작");

    RaceConditionDemo.run();

    System.out.println("실습 종료");
  }
}
