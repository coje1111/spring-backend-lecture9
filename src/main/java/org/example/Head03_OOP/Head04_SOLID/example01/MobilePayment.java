package org.example.Head03_OOP.Head04_SOLID.example01;

public class MobilePayment implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("모바일 결제: " + amount + "원");
    }
}
