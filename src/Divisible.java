import java.math.BigDecimal;
//* Chapter 10 Question 21
// (Divisible by 5 or 6) Find the first ten numbers greater than Long.MAX_VALUE"
// "that are divisible by 5 or 6."
// Cristian Toledo
// 10-6-17
public class Divisible {

    public static void main(String[] args) {

        int count = 0;
        BigDecimal number = new BigDecimal(Long.MAX_VALUE).add(BigDecimal.ONE);
        while (count < 10) {

            if (number.remainder(new BigDecimal(5)).equals(BigDecimal.ZERO) ||
                    number.remainder(new BigDecimal(6)).equals(BigDecimal.ZERO)) {
                count++;
                System.out.println(count+ ": " +number);
            }
            number = number.add(BigDecimal.ONE);
        }
    }
}
