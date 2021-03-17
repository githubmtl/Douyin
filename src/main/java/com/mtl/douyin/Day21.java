package com.mtl.douyin;


import java.math.BigDecimal;


                                     /**
                                      * 正确答案：输出2
                                      * 结果说明：BigDecimal对象的multiply方法返回一个新的BigDecimal对象
                                      * 原BigDecimal对象b不会发生变化，和String的substring等方法类似
                                      * b=b.multiply(new BigDecimal("3"));结果才为6
                                      */
                                      public class Day21 {
                                          public static void main(String[] args) {
                                              BigDecimal b=new BigDecimal("2");
                                              b.multiply(new BigDecimal("3"));
                                              System.out.println(b.toString());
                                          }
                                      }


