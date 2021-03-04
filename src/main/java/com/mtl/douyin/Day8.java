package com.mtl.douyin;

/**
 * 正确答案：输出0
 *  count=count++可以分解为以下两句
 *  int temp=count++;//执行完temp=0
 *  count=temp;所以count=0
*/
public class Day8 {
    public static void main(String[] args) {
        int count=0;
        count=count++;
        System.out.println(count);
    }
}







