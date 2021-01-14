package Chapter7;

public class SalesCommissions {

    private final static int basePay = 200;
    public static void getSalesCommissionDistribution(int[] sales, int[] frequency){
        for (int sale : sales){
            int commission = (int) (sale * 0.09);
            int pay = basePay + commission;
            pay = pay/100;

            switch (pay){
                case 2: ++frequency[0];
                break;
                case 3: ++frequency[1];
                    break;
                case 4: ++frequency[2];
                    break;
                case 5: ++frequency[3];
                    break;
                case 6: ++frequency[4];
                    break;
                case 7: ++frequency[5];
                    break;
                case 8: ++frequency[6];
                    break;
                case 9: ++frequency[7];
                    break;
                default: ++frequency[8];
            }
        }
    }
}
