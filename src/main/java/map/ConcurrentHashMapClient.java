package map;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Copyright 2018/2/23 lcfarm All Rights Reserved
 * 请添加类/接口的说明：
 *
 * @Package: map
 * @author: Jerrik
 * @date: 2018/2/23 20:22
 */
public class ConcurrentHashMapClient {
    public static void main(String[] args) {
         Map<String,Object> map = new ConcurrentHashMap<>();

         map.put("hello","world");
         map.put("hello","world");
    }
}
