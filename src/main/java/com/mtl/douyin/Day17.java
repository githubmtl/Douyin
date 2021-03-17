package com.mtl.douyin;

                                         /**
                                          * 正确答案：编译正常，程序输出 13
                                          * x=5这一行不会编译错误，那为什么x=5在声明前可以赋值？
                                          * 静态变量是在类初始化时声明的，JVM初始化类时会去查找类中所有的静态声明，
                                          * 然后分配空间，注意这时候只是完成了内存空间的分配，还没有赋值，
                                          * 之后JVM会根据类中静态赋值（包括静态类赋值和静态块赋值）的先后顺序来执行。
                                          * 所以以下代码可以拆分为以下语句：
                                          * static int x;
                                          * x=10;
                                          * x+=3；所以最终输出13
                                          */
                                         public class Day17 {
                                             static {
                                                 x=5;
                                             }
                                             static int x=10;
                                             public static void main(String[] args) {
                                                 System.out.println(Day17.x);
                                             }
                                             static {
                                                 x+=3;
                                             }
                                         }





