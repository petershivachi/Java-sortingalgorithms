public class RecursionOne
{
    public static int factorial1(int n)
    {
        if (n <= 1)
        {
            return 1;
        }else {
            return n * factorial1(n -1);
        }
    }

    public static int factorialVisualization1(int n)
    {
        System.out.println("\nFinding the factorial of : "+n);
        if (n <= 1)
        {
            System.out.println("\nFactorial is "+n+" = 1");
            return 1;
        }else {
            System.out.println("\nFactorial is "+n+" = "+(n*factorial1(n - 1)));
            return n * factorial1(n - 1);
        }
    }

    public static void main(String args[])
    {
        factorialVisualization1(10);
    }
}
