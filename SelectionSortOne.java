public class SelectionSortOne
{
    public static void selectionSort1(int[] input)
    {
        for (int a = 0; a < input.length-1; a++)
        {
            int smallestIndex = a;
            for (int b = a + 1; b < input.length; b++)
            {
                if (input[b] < input[smallestIndex])
                {
                    smallestIndex = b;
                }
            }

            int tempo = input[a];
            input[a] = input[smallestIndex];
            input[smallestIndex] = tempo;
        }
    }

    public static void displayArray(int[] num)
    {
        for (int a = 0; a < num.length; a++)
        {
            System.out.print(num[a]+", ");
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        int[] input = {12, 43, 21, 32,64, 76, 78, 90, 56, 44};
        selectionSort1(input);
        displayArray(input);
    }
}
