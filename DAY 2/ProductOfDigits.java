import java.util.Scanner;

class ProductOfDigits
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n, digit, product = 1;

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        while(n > 0)
        {
            digit = n % 10;
            product = product * digit;
            n = n / 10;
        }

        System.out.println("Product of digits = " + product);
    }
}
