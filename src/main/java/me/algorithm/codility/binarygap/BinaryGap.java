package me.algorithm.codility.binarygap;

import java.util.Arrays;
import java.util.List;

/**
 * @author Minhyuk Yoon (ymh92730@gmail.com)
 * @since 2019-05-28
 */
public class BinaryGap {

    public int solution(int N) {
        String binary = Integer.toBinaryString(N);
        if (!binary.matches(".*10+1.*")) return 0;
        if (!binary.matches(".+1^")) binary = binary.substring(0, binary.lastIndexOf("1") + 1);

        String[] split = binary.split("1");
        List<String> strings = Arrays.asList(split);
        return strings.stream()
                .reduce((s, s2) -> s.length() <= s2.length() ? s2 : s)
                .map(String::length)
                .orElse(0);
    }
}
