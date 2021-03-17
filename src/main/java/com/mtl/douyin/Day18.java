package com.mtl.douyin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



                                   /**
                                    * 正确答案：D【4,3,1,6】
                                    * 本题考查list add用法
                                    * 前面4句代码调用list.add(e)方法，新添加的元素在list最后面
                                    * 所以前4句执行完list应该是【5,3,1,6】
                                    * 语句5调用list.add(index,e)，意思是在index前面插入新元素e
                                    * 所以执行完语句5，list应该是【4,5,3,1,6】
                                    * 语句6删除index为1的元素，所以最后为【4,3,1,6】
                                    *
                                   */
                                   public class Day18 {
                                       public static void main(String[] args) {
                                           List<Integer> list= new ArrayList<>();
                                           list.add(5);//语句1
                                           list.add(3);//语句2
                                           list.add(1);//语句3
                                           list.add(6);//语句4
                                           list.add(0,4);//语句5
                                           list.remove(1);//语句6
                                           System.out.println(list);
                                       }
                                   }




