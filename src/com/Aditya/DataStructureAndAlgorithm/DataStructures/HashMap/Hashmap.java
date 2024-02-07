package com.Aditya.DataStructureAndAlgorithm.DataStructures.HashMap;

import javax.swing.text.html.parser.Entity;
import java.util.HashMap;
import java.util.HashSet;

public class Hashmap {
    public static void main(String[] args) {
//        String name = "Aditya";
//        int code = name.hashCode();
//        System.out.println(code);
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
//        System.out.println(map.get("a"));
//        System.out.println(map.getOrDefault("a",2));

        HashSet<Integer> set = new HashSet<>();
        set.add(56);
        set.add(9);
        set.add(16);
        set.add(1);
        set.add(4);
        set.add(23);
//        System.out.println(set);
        MapusingHash m = new MapusingHash();
        m.put("M","d");
        m.put("a","e");
        m.put("r","e");
        System.out.println(m.get("M"));
    }
}
class MapusingHash {
    private Entity[] entities;
    public MapusingHash() {
        entities = new Entity[100];
    }
    public void put(String key, String value) {
        int hash = Math.abs(key.hashCode() % entities.length);
        entities[hash] = new Entity(key, value);
    }
    public String get(String key) {
        int hash = Math.abs(key.hashCode() % entities.length);
        if (entities[hash] != null && entities[hash].key.equals(key)) {
            return entities[hash].value;
        }
        return null;
    }
    public  void remove(String key) {
        int hash = Math.abs(key.hashCode() % entities.length);
        if (entities[hash] != null && entities[hash].key.equals(key)) {
            entities[hash] = null;
        }
    }
    private class Entity {
        String key;
        String value;
        public Entity(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}
