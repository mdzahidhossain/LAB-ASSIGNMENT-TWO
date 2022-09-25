package BasicJava;

import java.util.Scanner;

public class UnitConversionRunner
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Convert From? ");
        String convertFrom = input.nextLine();

        System.out.print("Convert To? ");
        String convertTo = input.nextLine();

        System.out.print("Value? ");
        double value = input.nextDouble();

        input.close();

        UnitConversion convert = new UnitConversion();

        System.out.printf("%.1f %s = %.1f %s", value, convertFrom, convert.convert(convertFrom, convertTo, value), convertTo);
    }
}