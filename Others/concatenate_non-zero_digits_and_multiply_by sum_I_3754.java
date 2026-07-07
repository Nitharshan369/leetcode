class Solution {
    public long sumAndMultiply(int n) {
        long x = 0;
        long place = 1;

        while (n > 0) {
            int digits = n % 10;
            if (digits != 0) {
                x += digits * place;
                place *= 10;
            }
            n /= 10;
        }

        long temp = x;
        long sum = 0;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        return x * sum;
    }
}