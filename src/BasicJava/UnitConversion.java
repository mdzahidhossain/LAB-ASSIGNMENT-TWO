package BasicJava;

public class UnitConversion
{
    private String from, to;
    private double value;

    public UnitConversion()
    {
        this.from = "";
        this.to = "";
        this.value = 0;
    }

    public UnitConversion(String from, String to, double value)
    {
        this.from = from;
        this.to = to;
        this.value = value;
    }

    public void setConvertFrom(String from)
    {
        this.from = from;
    }

    public void setConvertTo(String to)
    {
        this.to = to;
    }

    public void setValue(double value)
    {
        this.value = value;
    }
    public double convert(String from, String to, double value)
    {
        if(from.equals("fl. oz"))
        {
            if(to.equals("ml"))
            {
                return value * 29.5735;
            }
            else if(to.equals("l"))
            {
                return value * .0295735;
            }
            else
            {
                System.out.println("Cannot convert from ".concat(from).concat(" to ").concat(to));
                return 0;
            }
        }

        else if(from.equals("gal"))
        {
            if(to.equals("l"))
            {
                return value * 3.78541;
            }
            else if(to.equals("ml"))
            {
                return value * 3785.41;
            }
            else
            {
                System.out.println("Cannot convert from ".concat(from).concat(" to ").concat(to));
                return 0;
            }
        }
        else if(from.equals("oz"))
        {

             if(to.equals("g"))
            {
                return value * 28.3495;
            }
            else if(to.equals("kg"))
            {
                return value * .0283495;
            }
            else
            {
                System.out.println("Cannot convert from ".concat(from).concat(" to ").concat(to));
                return 0;
            }
        }

        else if(from.equals("lb"))
        {
            if(to.equals("kg"))
            {
                return value * .453592;
            }
            else if(to.equals("g"))
            {
                return value * 453.592;
            }
            else
            {
                System.out.println("Cannot convert from ".concat(from).concat(" to ").concat(to));
                return 0;
            }
        }
        else if(from.equals("in"))
        {
            if(to.equals("km"))
            {
                return value * 2.45E-5;
            }
            else if(to.equals("m"))
            {
                return value * .0254;
            }
            else if(to.equals("cm"))
            {
                return value * 2.54;
            }
            else if(to.equals("mm"))
            {
                return value * 25.4;
            }
            else
            {
                System.out.println("Cannot convert from ".concat(from).concat(" to ").concat(to));
                return 0;
            }
        }

        else if(from.equals("ft"))
        {
            if(to.equals("km"))
            {
                return value * 3.048E-4;
            }
            else if(to.equals("m"))
            {
                return value * .3048;
            }
            else if(to.equals("cm"))
            {
                return value * 30.48;
            }
            else if(to.equals("mm"))
            {
                return value * 304.8;
            }
            else
            {
                System.out.println("Cannot convert from ".concat(from).concat(" to ").concat(to));
                return 0;
            }
        }
        else if(from.equals("mi"))
        {
            if(to.equals("km"))
            {
                return value * 1.60934;
            }
            else if(to.equals("m"))
            {
                return value * 1609.34;
            }
            else if(to.equals("cm"))
            {
                return value * 160934;
            }
            else if(to.equals("mm"))
            {
                return value * 1609E6;
            }
            else
            {
                System.out.println("Cannot convert from ".concat(from).concat(" to ").concat(to));
                return 0;
            }
        }
        else
        {
            System.out.println("Wrong input:");
            return 0;
        }
    }
}