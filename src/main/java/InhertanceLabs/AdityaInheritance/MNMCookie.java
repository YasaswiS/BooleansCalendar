package InhertanceLabs.AdityaInheritance;

class MNMCookie extends Cookie
{
    public int mnmCount;

    public MNMCookie(int chocChipNum, int cookieDiameter, int StartMNMCount)
    {
        super(chocChipNum, cookieDiameter);
        mnmCount = StartMNMCount;
    }

    public MNMCookie(int chocChipNum, int cookieDiameter) {
        super(chocChipNum, cookieDiameter);
    }

    public void addMnm(int addNum) {
        mnmCount = mnmCount + addNum;
    }

    @java.lang.Override
    public String toString() {
        return (super.toString() + " The number of MNMs used was " + mnmCount + ".");
    }
}