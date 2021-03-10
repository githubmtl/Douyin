package com.mtl.douyin;


/**
 * 正确答案：语句3和语句5编译错误
 * 结果类型，按以下规则(有顺序性，比如满足规则1，则以规则1为准)
 * 1.在java运算中byte、short、char的值自动提升为int
 * 2.如果操作数中有一个类型是double，计算结果是double型
 * 3.如果操作数中有一个类型是float，计算结果是float型
 * 4.如果操作数中有一个类型是long，计算结果是long型
 * 5.如果操作数中有一个类型是int，计算结果是int型
 * 6.使用final修饰的变量不会自动改变类型
 * 语句3中，b1和b2会自动转换为Int类型再计算，所以结果为int
 * 语句4中，b3,b4使用final，不会自动变类型,所以结果为byte
 * 语句5中，b1自动转为int，b3为final修饰，不转为int,所以int+byte，结果为int
 * 语句6中和语句5类似，计算结果为int，但是println可以打印int类型，所以不报错
 */
public class Day12 {
    public static void main(String[] args) {
        byte b1=1,b2=2;             /**语句1*/
        final byte b3=3,b4=5,b5;    /**语句2*/
        //byte b7=b1+b2;              /**语句3*/
        byte b8=b3+b4;              /**语句4*/
        //b5=b1+b3;                   /**语句5*/
        //System.out.println(b2+b5);  /**语句6*/
    }
}
