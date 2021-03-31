package recursionlabs;

public class FrogRiver {

    public static int PathsToNthStone(int n) {
        if (n == 1 || n==0) {
            return 1;
        } else {
            return PathsToNthStone(n-1)+PathsToNthStone(n-2);
        }

    }

    public static void main(String[] args) {
        FrogRiver test = new FrogRiver();

        System.out.println(test.PathsToNthStone(3));
    }

}
