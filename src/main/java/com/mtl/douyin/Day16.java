package com.mtl.douyin;

                                /**
                                 * 正确答案为A.程序输出1.0
                                 * 知识点1：执行i1==i2时，i1会自动拆箱，所以i1==i2为true
                                 * 知识点2：条件？表达式1：表达式2为三目运算
                                 * 以下两种场景会触发类型对齐的拆箱操作：
                                 * 【1】表达式1或表达式2的值只要有一个是原始类型
                                 * 【2】表达式1或表达式2的值的类型不一致，会强制拆箱升级成
                                 *      表示范围更大的那个类型
                                */
                                public class Day16 {
                                    public static void main(String[] args) {
                                        Integer i1=new Integer(1);
                                        int i2=1;
                                        Object o=i1==i2?new Integer(1):new Double(2);
                                        System.out.println(o);
                                    }
                                }





