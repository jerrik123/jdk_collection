package map;

import java.util.HashMap;
import java.util.Map;

/**
 * Copyright 2018/2/23 lcfarm All Rights Reserved
 * 请添加类/接口的说明：JDK1.8
 *
 * @Package: map
 * @author: Jerrik
 * @date: 2018/2/23 20:10
 */
public class HashMapClient {
    public static void main(String[] args) {
        Map<String,Object> map = new HashMap<>();

        map.put("hello","world");
        map.put("hello1","world");

        System.out.println(map);
    }
}
