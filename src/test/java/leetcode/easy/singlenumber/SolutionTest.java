package leetcode.easy.singlenumber;

import fr.agaborit.leetcode.easy.singlenumber.Solution;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void cas_1() {
        var s = new Solution();
        var input = new int[] {2, 2, 1};
        var result = s.singleNumber(input);
        assertThat(result).isEqualTo(1);
    }

    @Test
    void cas_2() {
        var s = new Solution();
        var input = new int[] {4, 1, 2, 1, 2};
        var result = s.singleNumber(input);
        assertThat(result).isEqualTo(4);
    }

    @Test
    void cas_3() {
        var s = new Solution();
        var input = new int[] {1};
        var result = s.singleNumber(input);
        assertThat(result).isEqualTo(1);
    }

}
