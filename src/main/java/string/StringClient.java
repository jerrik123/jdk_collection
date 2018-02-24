package string;

/**
 * Copyright 2018/2/23 lcfarm All Rights Reserved
 * 请添加类/接口的说明：
 *
 * @Package: map
 * @author: Jerrik
 * @date: 2018/2/23 20:40
 */
public class StringClient {
    public static void main(String[] args) {
//        String s0 = "kvill";
//        String s1 = new String("kvill");
//        String s2 = "kv" + new String("ill");
//        System.out.println(s0 == s1);
//        System.out.println(s0 == s1.intern());
//        System.out.println(s0 == s1);
//        System.out.println(s0 == s2);
//        System.out.println(s1 == s2);

//        String s = new String("1");
//        String s2 = "1";
//        s = s.intern();
//        System.out.println(s == s2);


//        String s = new String("1");
//        s.intern();
//        String s2 = "1";
//        System.out.println(s == s2);//false
//
//        String s3 = new String("1") + new String("1");
//        s3.intern();
//        String s4 = "11";
//        System.out.println(s3 == s4);//true


        String s = new String("1");
        String s2 = "1";
        s.intern();
        System.out.println(s == s2);//false

        String s3 = new String("1") + new String("1");
        String s4 = "11";
        s3.intern();
        System.out.println(s3 == s4);//false
    }
}
