package FRQ.Aditya.InheritanceLab;

class Cookie
{
    public int chocChipNum;
    public int cookieDiameter;

    public Cookie(int chocChipNum, int cookieDiameter)
    {
        this.chocChipNum = chocChipNum;
        this.cookieDiameter = cookieDiameter;
    }

    public String toString()
    {
        return ("Used " + chocChipNum + " chocolate chips to make a cookie with a diameter of " + cookieDiameter) + ".";
    }
}