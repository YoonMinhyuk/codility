package me.algorithm.codility.binarygap;


import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Minhyuk Yoon (ymh92730@gmail.com)
 * @since 2019-05-28
 */
public class BinaryGapTest {
    @Test
    public void test() {
        //Given
        int n = 1041;
        int expected = 5;
        BinaryGap binaryGap = new BinaryGap();

        //When Then
        assertThat(binaryGap.solution(n)).isEqualTo(expected);
    }
}
