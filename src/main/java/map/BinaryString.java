package map;

/**
 * Copyright 2018/2/24 lcfarm All Rights Reserved
 * 请添加类/接口的说明：
 *
 * @Package: map
 * @author: Jerrik
 * @date: 2018/2/24 10:32
 */
public class BinaryString {
    public static void main(String[] args) {
        //  100000000000000000000000000000001 //-1的原码
        //  111111111111111111111111111111110 //除符号位按位取反
        //  111111111111111111111111111111111 //加1(补码)
        System.out.println("-1的二进制表示: " + Integer.toBinaryString(-1));
        System.out.println("-1<<29位: " + Integer.toBinaryString((-1<<29)));// 11100000000000000000000000000000
        System.out.println();

        //  100000000000000000000000000000101 //-5的原码
        //  111111111111111111111111111111010 //除符号位按位取反
        //  111111111111111111111111111111011 //加1(补码)
        System.out.println("-5的二进制表示: " + Integer.toBinaryString(-5));
        System.out.println("-5<<29位: " + Integer.toBinaryString((-5<<29)));
        System.out.println("len: " + Integer.toBinaryString((-5<<29)).length());//31位,0省略
        System.out.println();

        //  100000000000000000000000000001011 //-11的原码
        //  111111111111111111111111111110100 //除符号位按位取反
        //  111111111111111111111111111110101 //加1(补码)
        System.out.println("-11的二进制表示: " + Integer.toBinaryString(-11));
        System.out.println("-11<<29位: " + Integer.toBinaryString((-11<<29)));
        System.out.println();


        System.out.println("-1<<29 | 0: " + Integer.toBinaryString((-1<<29 | 0)));//11100000000000000000000000000000

        System.out.println("1<<29: " + Integer.toBinaryString(1<<29));//00100000000000000000000000000000

        System.out.println("capacity0: " + Integer.toBinaryString(((1 << 29))));    //00100000000000000000000000000000
        System.out.println("capacity1: " + Integer.toBinaryString(((1 << 29) - 1)));//00011111111111111111111111111111
        System.out.println("-1<<29 & ((1 << 29) - 1)): " + (-1<<29 & ((1 << 29) - 1)));//0

        System.out.println();
        System.out.println("value: " + Integer.toBinaryString(((1 << 29) - 1)));//00011111111111111111111111111111
        System.out.println("~: " + Integer.toBinaryString(~((1 << 29) - 1)));//11100000000000000000000000000000

        System.out.println("0<29");
    }
}
