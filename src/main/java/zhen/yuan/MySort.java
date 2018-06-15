package zhen.yuan;/** * 排序工具类 * @Author:zhenyuan * @Date:Created in 10:55 2018/6/15 */public class MySort {    /**     * 冒泡排序     * @param array     */    public static void selectSort(int[] array){        int length = array.length;        int temp,index=0;        for (int i=0;i<length;i++){            index=i;            for (int j=i+1;j<length;j++){                if (array[j]<array[index]){                    index=j;                }            }            temp=array[index];            array[index]=array[i];            array[i]=temp;        }    }    /**     * 选择排序     * @param array     */    public static void bubleSort(int[] array){        int length = array.length;        int temp;        for (int i=0;i<length;i++){            for (int j=0;j<length-i-1;j++){                if (array[j]>array[j+1]){                    temp = array[j+1];                    array[j+1]=array[j];                    array[j]=temp;                }            }        }    }    /**     * 归并排序     * @param array     */    public static void mergeSort(int[] array){        mergeSort(array,0,array.length);    }    private static void mergeSort(int[] array,int l,int h){        if (h>l){            int mid = l+(h-l)/2;            mergeSort(array,l,mid);            mergeSort(array,mid+1,h);            sort(array,l,h);        }        return ;    }    private static void sort(int[] a,int l,int h){        int length = h-l+1, mid = l+(h-l)/2,index=0,l1=mid+1,low = l;        int[] aus = new int[length];        while (l<=mid&l1<=h){            if ((a[l]<a[l1])){ aus[index++]=a[l++];}            else {aus[index++]=a[l1++];}        }        while (l1<=h){            aus[index++]=a[l1++];        }        while (l<=mid){            aus[index++]=a[l++];        }        for (int i=0;i<length;i++){            a[i+low]=aus[i];        }    }    /**     * 快速排序     * @param array     */    public static void quickSort(int[] array){        quickSort(array,0,array.length);    }    private static void quickSort(int[] a,int l,int h){        while (l<h){            int mid = getElement(a,l,h);            quickSort(a,l,mid);            quickSort(a,mid+1,h);        }    }    private static int getElement(int[] a,int l,int h){        int temp;        int i=l,j=h;        while (l!=h){            while (a[j]>=a[l]&j>=l&l!=h){j--;}            while (a[i]<=a[l]&i<=h&l!=h){i++;}            if (i<j){                temp=a[i];                a[i]=a[j];                a[j]=temp;            }else {                temp=a[j];                a[j]=a[l];                a[l]=temp;            }        }        return j;    }}