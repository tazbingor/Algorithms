package chapter_1;

import java.util.Arrays;
import java.util.Scanner;


public class BinarySearch {

    /**
     * 二分查找
     *
     * @param key 元素
     * @param a 目标数组
     * @return 下标
     */
    private static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (key < a[mid])
                hi = mid - 1;
            else if (key > a[mid])
                lo = mid + 1;
            else
                return mid;
        }
        return -1;
    }


    public static void main(String[] args) {
//            int[] whiteList = In.readInts(args[0]);//出现数组越界

        int[] whiteList = {1, 99, 3, 55, 44, 88, 25, 6, 4};
        Arrays.sort(whiteList);

        for(int i : whiteList)
            System.out.print(i + " ");

        System.out.println("\n  请输入要查询的数");
        // 使用命令行参数
        // System.out.println(args[0]);
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();

        System.out.println("下标索引为" + rank(key, whiteList));
    }


}
