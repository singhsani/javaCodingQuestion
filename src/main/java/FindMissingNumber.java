import java.util.Arrays;
public class FindMissingNumber {
    public static void main(String[] args) {
        int n=8;
        int[] list= {1,3,4,5,6,7,8};
        int sum=Arrays.stream(list).sum();
        int sumOfNNatural= (n*(n+1))/2;
        System.out.println(sumOfNNatural-sum);
    }
}
