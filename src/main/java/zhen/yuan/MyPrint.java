package zhen.yuan;/** * @Author:zhenyuan * @Date:Created in 11:38 2018/6/15 */public class MyPrint {    public static void printArray(int[] array,String explain){        System.out.print(explain+":[ ");        for (int i :                array) {            System.out.print(i+" ");        }        System.out.print("]");        System.out.println();    }}