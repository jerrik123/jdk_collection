package map;

import java.util.IdentityHashMap;
import java.util.Map;

/**
 * Copyright 2018/2/23 lcfarm All Rights Reserved
 * 请添加类/接口的说明：
 *
 * @Package: map
 * @author: Jerrik
 * @date: 2018/2/23 14:29
 */
public class IdentityHashMapClient {
    private static class Person{
        private Integer age;
        private String name;

        public Person(Integer age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public int hashCode() {
            return age.hashCode() + name.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            if(!(obj instanceof Person)){
                return false;
            }
            Person p = (Person)obj;
            return this.age.equals(p) && this.name.equals(p.name);
        }
    }

    public static void main(String[] args) {
        Map<Person,Object> map = new IdentityHashMap();

        Person p1 = new Person(20,"jerrik");
        Person p2 = new Person(21,"smith");
        Person p3 = new Person(20,"jerrik");

        map.put(p1,"world");
        map.put(p2,"world1");
        map.put(p3,"world2");

        System.out.println(map);
        System.out.println(map.get(p3));

    }
}
