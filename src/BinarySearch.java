
// java ResizingArrayStack < ../data/tobe.txt 
import java.util.Arrays;

public class BinarySearch {
    public static int rank(int key, int[] a) {
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
        // 作为要查找的数组从文件中读取
        int[] whitelist = In.readInts(args[0]);

        Arrays.sort(whitelist);

        while (!StdIn.isEmpty()) {
            // 从stdin输入要查找的数字
            int key = StdIn.readInt();

            // 打印没找到的数字
            if (rank(key, whitelist) == -1)
                StdOut.println(key);
        }
    }
}