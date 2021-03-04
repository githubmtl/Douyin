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
/**
 * 正确答案：没有输出
 * 因为途中两个方法不是构造方法，构造方法没有返回值
 * 连void都没有
*/
public class Day7 {
    public static void main(String[] args) {
        A a=new B();
    }
}



