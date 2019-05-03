package com.company;

class OperateDemo{
    public static void main(String [] args){
        int x = 6370;
        x = x / 1000 * 1000;
        System.out.println(x);          // 6000

        System.out.println( 5 % 2);
        System.out.println(3 + "2");    // 32

        System.out.println( "5 + 5 = " + (5 + 5));      // 5 + 5 = 10

        int a = 4, b = 5;
        System.out.println("a = " + a + ", b = " + b);

        int c = 3, d;
        d = (c ++ ) + (++ c) + (c ++) + c;
        System.out.println("c = " + c + ", d = " + d);     // 6  19

        int i = 3;
        i = i ++;
        System.out.println("i = " + i);     // 3 ，jvm 处理 i++ 时临时变量接收 i++的值，先自增后又赋值为3
    }
}