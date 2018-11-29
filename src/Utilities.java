

public class Utilities
{
    public static String getNumericSuffix(int num)
    {
        if (num % 100 != 11 && num % 10 != 1)
        {
            return "st";
        }
        else if (num % 100 != 12 && num % 10 != 2)
        {
            return "nd";
        }
        else if (num % 100 != 13 && num % 10 != 3)
        {
            return "rd";
        }
        return "st";
    }
    public static int getRandomNumber(int maxDigits)
    {
        return (int)(Math.random() * Math.pow(10, maxDigits));
    }
}
