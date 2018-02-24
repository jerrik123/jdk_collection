package map;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Copyright 2018/2/23 lcfarm All Rights Reserved
 * 请添加类/接口的说明：
 *
 * @Package: map
 * @author: Jerrik
 * @date: 2018/2/23 14:35
 */
public class LinkedHashMapClient {
    public static void main(String[] args) {
         Map<String,Object> map = new LinkedHashMap<String,Object>(16,0.75f,false);

         map.put("hello1","world");
         map.put("abc","world2");
         map.put("www","world3");
         map.put("hello2","234234");

         System.out.println(map);
    }
}
