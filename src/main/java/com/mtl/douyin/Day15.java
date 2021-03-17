package com.mtl.douyin;

                                         /**
                                          * 正确对答案：输出ABDCBDCB
                                          * 结果说明：for（表达式一;表达式二;表达式三）{
                                          *              循环操作
                                          *         }
                                          * 表达式一：参数初始化
                                          * 表达式二：条件判断
                                          * 表达式三：更新循环变量
                                          *
                                          * 执行流程：
                                          * 步骤一：执行表达式一.初始化参数
                                          * 步骤二：执行表达式二进行循环条件的判断
                                          * 步骤三：如果循环条件为true则执行循环操作，如果为false则退出循环执行后续代码
                                          * 步骤四：当循环操作执行完毕后执行表达式三，更新循环变量
                                          * 表达式三执行完毕后继续执行表达式二进行循环判断，如果为真则执行循环操作，
                                          * 如果为假则退出循环执行后续代码，以此类推...........
                                         */
                                         public class Day15 {
                                             public static void main(String[] args) {
                                                 int i=0;
                                                 for (wssb('A');wssb('B')&&i<2;wssb('C')){
                                                     i++;
                                                     wssb('D');
                                                 }
                                             }

                                             static boolean wssb(char c){
                                                 System.out.print(c);
                                                 return true;
                                             }
                                         }






