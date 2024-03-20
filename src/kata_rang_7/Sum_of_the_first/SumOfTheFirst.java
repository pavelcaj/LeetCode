package kata_rang_7.Sum_of_the_first;

public class SumOfTheFirst {
    public static void main(String[] args) {
        System.out.println(seriesSum(2));

    }

    public static String seriesSum(int n) {
        double resultSum = 0;
        double begin = 4;


        while (true) {
            if (n > 1 ) {
                resultSum += (double) 1 / begin;
                n--;
                begin += 3;
            } else {
                break;
            }
        }
        if (n == 1) {
            resultSum += 1;
        }

        String str = String.format("%.2f", resultSum);
        return str;
    }
}
