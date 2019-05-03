package com.company;

class VarDemo2 {
    public static void main(String [] args){
        /**
         * 数据类型
         * byte     1个字节         -2^7 ～ 2^7-1               默认值0
         * short    2个字节         -2^15 ～ 2^15-1             默认值0
         * int      4个字节         -2^31 ～ 2^31-1             默认值0
         * long     8个字节         -2^63 ～ 2^63-1             默认值0L(l容易与1混淆)
         * float    4个字节         -3.4×10^38 ～ 3.4×10^38     默认值0.0f
         * double   8个字节         -1.7×10^308 ～ 1.7×10^208   默认值0.0d
         * char     1个字节         0 ～ 255
         * boolean  1个字节         true/false                  默认值false
         */


        int x = 3;
        byte b = 5;
        x = x + b;
        System.out.println(x);      // 正确

        byte b1 = 3;
        b1 = (byte)(b + 200);
        System.out.println(b1);     // 溢出, 输出-51

        System.out.println((char)('a' + 1));        // 'b'
        System.out.println('你' + 0);                // unicode 编码: 20320

        byte b2 = 4;
        b2 = 3 + 7;
        System.out.println(b2);         // 没有报错
        byte b3 = 3, b4 = 7;
        // b2 = b3 + b4;                // 【error]: java: 不兼容的类型：从int转换到byte可能会有损失
        System.out.println(b2);

        byte b5 = 127;
        System.out.println(b5);         // 127

        int x1 = Integer.MAX_VALUE;
        int x2 = 2;
        x = x1 + x2;
        System.out.println(x);          // 溢出，-2147483647

        int n = 8;
        n = 9;
        n = 19;
        System.out.println(n);          // 变量
    }
}
