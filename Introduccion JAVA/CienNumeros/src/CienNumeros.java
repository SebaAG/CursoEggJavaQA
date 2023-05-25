public class CienNumeros {
    public static void main(String[] args) {
        int[] num = new int[100];

        for (int i = 0 ; i < 100; i++) {
            num[i] += i;
        }

        for (int i = num.length - 1; i >= 0; i--) {
            System.out.println(num[i]);
        }
    }
}