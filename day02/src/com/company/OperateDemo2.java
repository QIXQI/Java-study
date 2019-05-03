package com.company;

class OperateDemo2{
    public static void main(String [] args){
        int a, b, c;
        a = b = c = 4;
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);

        int d = 4;
        d += 2;
        System.out.println("d = " + d);

        short s = 3;
        // 情况一
        //  s = s + 4;          // error，s+4为int型，转为short出错
        // 情况二
        s += 4;                 // 正确，Java 复合赋值 E1 op= E2 等价于 E1 = (T)(E1 op E2)，其中T是E1的数据类型
        System.out.println("s = " + s);
        // 情况三
        short e = 1, f = 1;
        // short s = e + f;     // error，精度小于int的数值运算的时候都会被自动转换为int后进行计算，应改为short(e+f)
        // 情况四
        s = (short)(s + 4);     // 正确
        System.out.println("s = " + s);
    }
}