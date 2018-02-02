/**
 *
 * @author mudu
 * @date 2018/2/2
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] array = {72,6,57,88,60,42,83,73,48,85};
        int[] fun = quick_sort(array, 0, array.length-1);
        for (int i : fun) {
            System.out.print(i+" ");
        }

    }

    public static int[] quick_sort(int s[], int l, int r)
    {
        if (l < r)
        {
            //Swap(s[l], s[(l + r) / 2]); //将中间的这个数和第一个数交换
            int i = l, j = r, x = s[l];
            while (i < j)
            {
                // 从右向左找第一个小于x的数
                while(i < j && s[j] >= x) {
                    j--;
                }
                if(i < j) {
                    s[i++] = s[j];
                }

                // 从左向右找第一个大于等于x的数
                while(i < j && s[i] < x) {
                    i++;
                }
                if(i < j) {
                    s[j--] = s[i];
                }
            }
            s[i] = x;
            // 递归调用
            quick_sort(s, l, i - 1);
            quick_sort(s, i + 1, r);
        }
        return s;
    }
}
