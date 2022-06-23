package leetcode.easy.validpalindrome;

import fr.agaborit.leetcode.easy.validpalindrome.Solution;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @ParameterizedTest
    @MethodSource("provideParamsForLeetcodeExempleTest")
    void leetcodeExempleTest(String input, boolean expected) {
        var s = new Solution();
        assertThat(s.isPalindrome(input)).isEqualTo(Boolean.valueOf(expected));
    }

    private static Stream<Arguments> provideParamsForLeetcodeExempleTest() {
        return Stream.of(
                Arguments.of("A man, a plan, a canal: Panama", true),
                Arguments.of("race a car", false),
                Arguments.of(" ", true)
        );
    }

}
