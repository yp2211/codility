package codility.challenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by peng.yang on ${Date}
 */
class MaximumCanMixTest {

    /*
     * Given juice = [10, 2, 1, 1] and capacity = [10, 3, 2, 2], your function should return 2. Rick can pour juice from the 3rd glass into the 2nd one.
     */
    @Test
    void solutionTest1() {

        int[] juice = new int[] {10, 2, 1, 1};
        int[] capacity = new int[] {10, 3, 2, 2};
        int expected = 2;
        int actual = MaximumCanMix.solution(juice, capacity);
        Assertions.assertEquals(expected, actual);
    }

    /*
     * Given juice = [1, 2, 3, 4] and capacity = [3, 6, 4, 4], your function should return 3. Rick can pour juice from the 0th and 2nd glasses into the 1st one.
     */
    @Test
    void solutionTest2() {

        int[] juice = new int[] {1, 2, 3, 4};
        int[] capacity = new int[] {3, 6, 4, 4};
        int expected = 3;
        int actual = MaximumCanMix.solution(juice, capacity);
        Assertions.assertEquals(expected, actual);
    }

    /*
     * Given juice = [2, 3] and capacity = [3, 4], your function should return 1. No matter which glass he chooses, Rick cannot pour juice from the other one into it. The maximum number of flavours in the chosen glass is 1.
     */
    @Test
    void solutionTest3() {

        int[] juice = new int[] {2, 3};
        int[] capacity = new int[] {3, 4};
        int expected = 1;
        int actual = MaximumCanMix.solution(juice, capacity);
        Assertions.assertEquals(expected, actual);
    }

    /*
     * Given juice = [1, 1, 5] and capacity = [6, 5, 8], your function should return 3. Rick can mix all juices in the 2nd glass.
     */
    @Test
    void solutionTest4() {

        int[] juice = new int[] {1, 1, 5};
        int[] capacity = new int[] {6, 5, 8};
        int expected = 3;
        int actual = MaximumCanMix.solution(juice, capacity);
        Assertions.assertEquals(expected, actual);
    }


}