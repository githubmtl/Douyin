package com.mtl.douyin;

                                                   /**
                                                    * 正确答案：true和false
                                                    * 原因：s4="hello"+"world" 在编译时
                                                    * 编译器会把代码优化为s4="helloworld"
                                                    * 所以s3,和s4都指向的是常量池中的"helloworld"，所以s3==s4为true
                                                    * s1+s2编译器会优化为StringBuilder sb=new StringBuilder();sb.append(s1);sb.append(s2);
                                                    * 所以返回的是一个新对象，所以s3==s5为false
                                                    * 但是如果s1和s2 用final修饰，即 final String s1="hello";final String s2="world";
                                                    * 那么s3==s5就为true 因为用final修饰的s1,s2为常量，常量在编译器就能确定值
                                                    * 所以s5=s1+s2时，其实就是s5="hello"+"world"。
                                                   */
                                                   public class Day20 {
                                                       public static void main(String[] args) {
                                                           String s1="hello";
                                                           String s2="world";
                                                           String s3="helloworld";
                                                           String s4="hello"+"world";
                                                           String s5=s1+s2;
                                                           System.out.println(s3==s4);
                                                           System.out.println(s3==s5);
                                                       }
                                                   }





