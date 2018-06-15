package zhen.yuan;

import java.util.Random;

/**
 * 随机数工具类
 *
 */
public class MyRandom
{
    private static Random random = new Random();

    /**
     * 获得指定大小的随机数组
     * @param size
     * @param max
     * @return
     */
    public static int[] getRandomArray(int size,int max){
        int[] array=new int[size];
        for (int i=0;i<size;i++){
            array[i]=random.nextInt(max);
        }
        return array;
    }
}
