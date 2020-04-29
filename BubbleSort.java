public class BubbleSort
{
    public static void bubbleSort(int[] number)
    {
        for (int k = 0; k < number.length - 1; k++)
        {
            for (int z = 0; z + 1 < number.length - k; z++)
            {
                if (number[z + 1] < number[z])
                {
                    int temp = number[z];
                    number[z] = number[z+ 1];
                    number[z + 1] = temp;
                }
            }
        }
    }

    public static void bubble(int[] number)
    {
        for (int k = 0; k < number.length - 1; k++)
        {
            boolean checked = false;
            for (int z = 0; z + 1 < number.length - k; z++)
            {
                if (number[z] > number[z + 1])
                {
                    checked = true;
                    int temp = number[z];
                    number[z] =number[z + 1];
                    number[z + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] array)
    {
        for (int k = 0; k < array.length; k++)
        {
            System.out.print(array[k]+", ");
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        int[] number = {12, 34, 56,67,87, 65, 2, 12, 31, 10};
        bubbleSort(number);
        bubbleSort(number);
        printArray(number);
    }
}
