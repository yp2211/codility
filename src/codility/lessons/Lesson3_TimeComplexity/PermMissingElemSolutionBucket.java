package codility.lessons.Lesson3_TimeComplexity;

import java.util.Arrays;

/**
 * Created by peng.yang on ${Date}
 */
public class PermMissingElemSolutionBucket extends AbstractPermMissingElem {
    @Override
    public int solution(int[] A) {
        boolean[] bucket = new boolean[100000 + 2];
        java.util.Arrays.fill(bucket, false);
        for (int anA : A) {
            bucket[anA] = true;
        }
        for (int i = 1; i < bucket.length; i++) {
            if (!bucket[i]) {
                return i;
            }
        }

        return 1;
    }
}
