import java.util.Scanner;
class SumNaturalNumbers
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n;
        int sum = 0;

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        for(int i = 1; i <= n; i++)
        {
            sum = sum + i;
        }
        System.out.println("Sum = " + sum);
    }
}