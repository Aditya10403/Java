package com.aditya.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RemoveSubFolders {
    public static void main(String[] args) {
        String[] folder = { "/a","/a/b","/c/d","/c/d/e","/c/f" };
        System.out.println(removeSubfolders(folder));
    }
    public static List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        List<String> res = new ArrayList<>();
        for (String s: folder) {
            if (res.isEmpty() || !s.startsWith(res.getLast() + "/")) {
                res.add(s);
            }
        }
        return res;
    }
}
