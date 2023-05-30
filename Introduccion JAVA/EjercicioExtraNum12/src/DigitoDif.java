public class DigitoDif {
    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    String num1 = (i == 3) ? "E" : String.valueOf(i);
                    String num2 = (j == 3) ? "E" : String.valueOf(j);
                    String num3 = (k == 3) ? "E" : String.valueOf(k);

                    System.out.println(num1 + " - " + num2 + " - " + num3);
                }
            }
        }
    }
}
