                                                           package com.mtl.douyin;





                                                           class Father{
                                                               public String name="F";
                                                               public String getName() {
                                                                   return name;
                                                               }
                                                           }

                                                           class Son extends Father{
                                                               public String name="S";
                                                               public String getName() {
                                                                   return name;
                                                               }
                                                           }

                                                           public class Day1 {
                                                               public static void main(String[] args) {
                                                                   Father sf=new Son();
                                                                   System.out.println(sf.name);
                                                                   System.out.println(sf.getName());
                                                               }
                                                           }