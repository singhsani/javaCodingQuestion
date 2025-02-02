/**
 *
 */
public class MoveAllZeroApproch2 {
    public static void main(String[] args) {
        int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]==0 && arr[j]==0){
                j--;
            }
            if(arr[i]==0 && arr[j]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
            if(arr[i]!=0 && arr[j]==0){
               i++;
               j--;
            }
            if(arr[i]!=0 && arr[j]!=0){
                i++;
            }
        }
        for(int n:arr){
            System.out.println(n);
        }
    }
}
