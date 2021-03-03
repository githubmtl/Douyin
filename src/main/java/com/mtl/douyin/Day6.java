package com.mtl.douyin;

/**
 * 正确答案为：10
 * Day7结果说明：程序进入wssb方法后，因为i=2
 * 所以执行case 2代码块，result+i*2,执行完result=4
 * 由于case 2中没有break语句，所以程序会继续执行后面的case语句
 * 所以又执行了 result=result+i*3,所以最终result=10
*/
public class Day6 {
    public static void main(String[] args) {
        System.out.println(wssb(2));
    }
    public static int wssb(int i){
        int result=0;
        switch (i){
            case 1:
                result=result+i;
            case 2:
                result=result+i*2;
            case 3:
                result=result+i*3;
        }
        return result;
    }
}





