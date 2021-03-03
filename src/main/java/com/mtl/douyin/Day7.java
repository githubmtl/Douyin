package com.mtl.douyin;

class A{
    public void A(){
        System.out.println("a");
    }
}

class B extends A{
    public void B(){
        System.out.println("b");
    }
}

public class Day7 {
    public static void main(String[] args) {
        A a=new B();
    }
}

