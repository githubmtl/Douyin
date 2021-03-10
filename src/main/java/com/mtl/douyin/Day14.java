package com.mtl.douyin;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

                      /**
                       * 正确答案：t2>t3
                       * 结果说明：l1为ArrayList内部实现为数组，l2为LinkedList内部实现为链表
                       * add(0,"data")方法实际是在List下标0处插入新数据“data”
                       * 数组查找性能好，插入删除性能差
                       * 链表插入删除性能好，查找性能差
                       * 此题是插入，所以t2耗时比t3长
                      */
                      public class Day14 {
                          public static void main(String[] args) {
                              List<String> l1=new ArrayList<>();
                              List<String> l2=new LinkedList<>();
                              for (int i = 0; i < 100000; i++) {
                                  l1.add(String.valueOf(i));
                                  l2.add(String.valueOf(i));
                              }
                              long t1 = System.currentTimeMillis();
                              for (int i = 0; i < 100000; i++) {
                                  l1.add(0,"data");
                              }
                              long t2=System.currentTimeMillis()-t1;
                              t1=System.currentTimeMillis();
                              for (int i = 0; i < 100000; i++) {
                                  l2.add(0,"data");
                              }
                              long t3=System.currentTimeMillis()-t1;
                          }
                      }






