package contest;

public class DistributeMoneyToMaximumChildren {
    public static void main(String[] args) {
        int money = 20;
        int children = 3;
        System.out.println(distMoney(money, children));
    }

    public static int distMoney(int money, int children) {
        if (children > money)
            return -1;
        if (money < 8)
            return 0;
        int parts = money / 8;
        int mod = money % 8;
        if (parts == children && mod == 0)
            return children;
        if (parts >= children)
            return children - 1;
        if (mod == 4 && (children - parts) == 1)
            return children - 2;
        if (mod >= children - parts)
            return parts;
        int remaining = children - parts;
        while (mod < remaining) {
            remaining++;
            mod += 8;
            parts--;
        }
        return parts;
    }
}
