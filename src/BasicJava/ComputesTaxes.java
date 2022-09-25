package BasicJava;

import java.util.Scanner;

public class ComputesTaxes
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int income, maritalStatus;
        double incomeTax = Double.MIN_VALUE;

        System.out.print("Marital status : \n1.married \n2.single\n");
        maritalStatus = input.nextInt();

        System.out.print("Please enter your income: ");
        income = input.nextInt();

        input.close();

        // Married Couple
        if(maritalStatus == 1)
        {
            // Test income
            if(income > 0 && income <= 16000)
            {
                incomeTax = 0.10 * income;
            }
            else if(income > 16000 && income < 64000)
            {
                incomeTax = (1600) + (0.15 * income);
            }
            else
            {
                incomeTax = (8800) + (0.25 * income);
            }
        }
        // Single Person
        else if(maritalStatus == 2)
        {
            // Test income
            if(income > 0 && income <= 8000)
            {
                incomeTax = 0.10 * income;
            }
            else if(income > 8000 && income < 32000)
            {
                incomeTax = (800) + (0.15 * income);
            }
            else
            {
                incomeTax = (4400) + (0.25 * income);
            }
        }
        else
        {
            System.out.println("INVALID MARITAL STATUS! [Note: Please choose 1 or 2]");
        }

        System.out.printf("Taxes to be Collected: %.2f\n", incomeTax);
    }
}