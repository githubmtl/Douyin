package com.mtl.douyin;

/**
 * 正确答案：输出true
 * if语句括号里面只能是boolean
 * 注意此题中是赋值语句，而非判断==
 * 所以括号里面先执行赋值，再执行if判断
 */
public class Day13 {
    public static void main(String[] args) {
        boolean flag=false;
        if (flag=true){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
