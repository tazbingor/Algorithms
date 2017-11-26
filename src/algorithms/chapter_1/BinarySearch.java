package chapter_1;
import java.util.Arrays;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.In;

public class BinarySearch {

    /**
     *
     * @param key
     * @param a
     * @return
     */
    public static int rank(int key,int[] a){
        int lo = 0;
        int hi = a.length - 1;
        while (lo <=hi){
            int mid = lo + (hi - lo) /2;
            if (key<a[mid])
                hi = mid-1;
            else if(key>a[mid])
                lo = mid+1;
            else
                return mid;
        }
        return -1;
    }


    public static void main(String[] args) {
//        System.out.print("你好世界");
//            int[] whiteList = In.readInts(args[0]);//出现数组越界
        In in = new In(args[0]);
        int[] whiteList = in.readAllInts();

        Arrays.sort(whiteList);

        while(!StdIn.isEmpty()){
            int key =StdIn.readInt();
            if (rank(key,whiteList) == -1)
                StdOut.print(key);
        }
    }


}
