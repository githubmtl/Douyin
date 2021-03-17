package com.mtl.douyin;


import java.util.concurrent.TimeUnit;

                                /**
                                 * 正确答案：程序中的循环会循环无数次
                                 * do-while语句是先执行循环一次，然后再检查条件
                                 * 第1次循环后，i=5;所以i!=0成立，继续循环
                                 * 第2次循环后，i=3;所以i!=0成立，继续循环
                                 * 第1次循环后，i=1;所以i!=0成立，继续循环
                                 * 第1次循环后，i=-1;所以i!=0成立，继续循环
                                 * 第1次循环后，i=-3;所以i!=0成立，继续循环
                                 * ...依次类推，所以会一直循环下去
                                */
                                public class Day19 {
                                    public static void main(String[] args) throws Exception {
                                        int i=7;
                                        do{
                                            System.out.println(--i);
                                            --i;
                                            TimeUnit.SECONDS.sleep(1);
                                        }while(i!=0);
                                        System.out.println(i);
                                    }
                                }



