import java.util.Scanner;

class MaximumSubarray {
    static int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE,sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>max){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] n = new int[size];
        for(int i=0;i<size;i++){
            n[i] = s.nextInt();
        }
        int maxsum = maxSubArray(n);
        System.out.println(maxsum);
    }
}