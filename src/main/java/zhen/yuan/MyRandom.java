package zhen.yuan;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * 随机数工具类
 */
public class MyRandom {
    private static Random random = new Random();

    /**
     * 获得指定大小的随机数组
     *
     * @param size
     * @param max
     * @return
     */
    public static int[] getRandomArray(int size, int max) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max);
        }
        return array;
    }

    public static int[] getRandomArrayUnrepeat(int size, int max) {
        int[] array = new int[size];
        Set<Integer> set = new HashSet<>();
        int count = 0, temp;
        while (count < 10) {
            temp = random.nextInt(max);
            if (set.contains(temp)) {continue;}
            set.add(temp);
            array[count] = temp;
            count++;
        }
        return array;
    }

    /**
     * get random with no param
     *
     * @return
     */
    public static int getRandom() {
        return random.nextInt();
    }

    /**
     * get random with param
     *
     * @param i
     * @return
     */
    public static int getRandom(int i) {
        return random.nextInt(i);
    }
}
