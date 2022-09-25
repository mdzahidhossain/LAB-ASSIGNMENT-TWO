package BasicJava;

import java.util.Scanner;

public class RomanNumbers
    {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Please enter Year: ");
            int year = input.nextInt();

            input.close();

            int thousandsVal, hundredsVal, tensVal, onesVal;

            onesVal = year % 10;
            tensVal = year % 100;
            hundredsVal = year % 1000;
            thousandsVal = year % 10000;

            if(year >= 0 && year <= 3999)
            {
                if(Integer.toString(year).length() == 4)
                {
                    System.out.println(getThousands(thousandsVal - hundredsVal) + getHundreds(hundredsVal - tensVal) +
                            getTens(tensVal - onesVal) + getOnes(onesVal));
                }
                else if(Integer.toString(year).length() == 3)
                {
                    System.out.println(getHundreds(hundredsVal - tensVal) + getTens(tensVal - onesVal) + getOnes(onesVal));
                }
                else if(Integer.toString(year).length() == 2)
                {
                    System.out.println(getTens(tensVal - onesVal) + getOnes(onesVal));
                }
                else if(Integer.toString(year).length() == 1)
                {
                    System.out.println(getOnes(onesVal));
                }
                else
                {
                    System.out.println("Something went wrong");
                }
            }
            else
            {
                System.out.println("This year is not valid.[Note: Please enter 0 to 3999]");
            }
        }
        public static String getOnes(int ones)
        {
            if(ones == 0)
            {
                return "";
            }
            else if(ones == 1)
            {
                return "I";
            }
            else if(ones == 2)
            {
                return "II";
            }
            else if(ones == 3)
            {
                return "III";
            }
            else if(ones == 4)
            {
                return "IV";
            }
            else if(ones == 5)
            {
                return "V";
            }
            else if(ones == 6)
            {
                return "VI";
            }
            else if(ones == 7)
            {
                return "VII";
            }
            else if(ones == 8)
            {
                return "VIII";
            }
            else if(ones == 9)
            {
                return "IX";
            }
            else
            {
                return "Something went wrong with ones";
            }
        }
        public static String getTens(int tens)
        {
            if(tens == 0)
            {
                return "";
            }
            else if(tens == 10)
            {
                return "X";
            }
            else if(tens == 20)
            {
                return "XX";
            }
            else if(tens == 30)
            {
                return "XXX";
            }
            else if(tens == 40)
            {
                return "XL";
            }
            else if(tens == 50)
            {
                return "L";
            }
            else if(tens == 60)
            {
                return "LX";
            }
            else if(tens == 70)
            {
                return "LXX";
            }
            else if(tens == 80)
            {
                return "LXXX";
            }
            else if(tens == 90)
            {
                return "XC";
            }
            else
            {
                return "Something went wrong with tens";
            }
        }
        public static String getHundreds(int hundreds)
        {
            if(hundreds == 0)
            {
                return "";
            }
            else if(hundreds == 100)
            {
                return "C";
            }
            else if(hundreds == 200)
            {
                return "CC";
            }
            else if(hundreds == 300)
            {
                return "CCC";
            }
            else if(hundreds == 400)
            {
                return "CD";
            }
            else if(hundreds == 500)
            {
                return "D";
            }
            else if(hundreds == 600)
            {
                return "DC";
            }
            else if(hundreds == 700)
            {
                return "DCC";
            }
            else if(hundreds == 800)
            {
                return "DCCC";
            }
            else if(hundreds == 900)
            {
                return "CM";
            }
            else
            {
                return "Something went wrong with hundreds";
            }
        }
        public static String getThousands(int thousands)
        {
            if(thousands == 0)
            {
                return "";
            }
            else if(thousands == 1000)
            {
                return "M";
            }
            else if(thousands == 2000)
            {
                return "MM";
            }
            else if(thousands == 3000)
            {
                return "MMM";
            }
            else
            {
                return "Something went wrong with thousands";
            }
        }

    }

