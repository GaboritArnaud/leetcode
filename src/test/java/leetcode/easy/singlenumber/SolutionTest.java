package leetcode.easy.singlenumber;

import fr.agaborit.leetcode.easy.singlenumber.Solution;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @ParameterizedTest
    @MethodSource("provideParamsForLeetcodeExempleTest")
    void leetcodeExempleTest(int[] input, int expected) {
        assertThat(new Solution().singleNumber(input)).isEqualTo(expected);
    }


    private static Stream<Arguments> provideParamsForLeetcodeExempleTest() {
        return Stream.of(
                Arguments.of(new int[] {2, 2, 1}, 1),
                Arguments.of(new int[] {4, 1, 2, 1, 2}, 4),
                Arguments.of(new int[] {1}, 1)
        );
    }
}
