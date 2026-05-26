package com.example.javathreadbasicdemo.practice03;

import com.example.javathreadbasicdemo.practice01.SyncAsyncComparisonDemo;
import com.example.javathreadbasicdemo.practice02.ThreadCreationDemo;
import com.example.javathreadbasicdemo.practice03.ThreadLifecycleDemo;

public class ThreadBasicDemoApplication {

  public static void main(String[] args) {

    System.out.println("Java Thread 기초와 동기화 실습 시작");

    SyncAsyncComparisonDemo.run();

    ThreadCreationDemo.run();

    ThreadLifecycleDemo.run();

    System.out.println("실습 종료");
  }
}
