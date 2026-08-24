class Aug24{
    public static void main(String[] args) {
        int[] stones = {-1,2,-3,4,-5};
         int n = stones.length;

        for (int i = 1; i < n; i++) {
            stones[i] += stones[i - 1];
        }

        int sum = stones[n - 1];

        for (int i = n - 2; i >= 1; i--) {
            sum = Math.max(
                sum,
                stones[i] - sum
            );
        }

        System.out.println(sum);
    }
}