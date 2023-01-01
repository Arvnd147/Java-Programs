public class Palindrom_upto_n {
    public static void main(String[] args) {
        int n = 1000, i;
        for (i = 1; i <= n; i++) {
            int num1 = i, num2 = i, rev=0, temp;
            while (num1 > 0) {
                temp = num1 % 10;
                rev = (rev * 10) + temp;
                num1 = num1 / 10;
            }
            if (rev == num2) {
                System.out.println(num2);
            }
        } 
    }    
}