public class Problem1 {
    public static void main(String[] args) {
        int[] numbers = {7,8,3,4,5,9,1,2};
        System.out.println(forSum(numbers));
        System.out.println(whileSum(numbers));
        System.out.println(reSum(numbers, numbers.length));

    }
    // using for loop
    public static int forSum(int[] numbers){
        int sum=0;
        for (int x:numbers)sum+=x;
        return sum;
    }
    // using while loop
    static int whileSum(int[] numbers){
        int sum=0;
        int cnt=0;
        while (cnt<numbers.length){
            sum+=numbers[cnt];
            cnt++;
        }
        return sum;
    }

    // using recursion
    static int reSum(int[] numbers, int length){
        if (length==0) return 0;
        else return numbers[length-1]+ reSum(numbers, length-1);
    }
}