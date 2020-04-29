public class MergeSortOne
{
    public static void mergeExecute(int[] num)
    {
        mergeSort(num, 0, num.length - 1);
    }

    public static void mergeSort(int[] num, int from, int to)
    {
        if (from < to)
        {
            int middle = (from + to)/2;
            mergeSort(num, from, to);
            mergeSort(num, middle + 1, to);
            merger(num, from, middle, to);
        }
    }

    public static void merger(int[] num, int from, int middle, int to)
    {
        int leftLength = middle - from + 1;
        int rightLength = to - middle;
        int[] left = new int[leftLength + 1];
        int[] right = new int[rightLength + 1];

        for (int a = 0; a < leftLength; a++)
        {
            num[a] = left[leftLength];
        }

        for (int a = 0; a < rightLength; a++)
        {
            num[a] = right[rightLength];
        }

        left[leftLength] = Integer.MAX_VALUE;
        right[rightLength] = Integer.MAX_VALUE;

        int leftPointer = 0;
        int rightPointer = 0;

        for (int a = 0; a <= to; a++)
        {
            if (left[leftPointer] < right[rightPointer])
            {
                num[a] = left[leftPointer];
                leftPointer++;
            }else
                {
                    num[a] = right[rightPointer];
                    rightPointer++;
                }
        }
    }

    public static void displayArray(int[] number)
    {
        for (int a = 0; a < number.length; a++)
        {
            System.out.print(number[a]+", ");
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        int[] num = {12, 34, 44, 56, 78, 52, 18, 58, 90, 66};
        mergeExecute(num);
        displayArray(num);
    }
}
