public class MoveAllzeroes {
    public static void main(String[] args) {
        int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[count++]=arr[i];
            }
        }
        for(int i=count;i<arr.length;i++){
            arr[i]=0;
        }
        for(int n:arr){
            System.out.println(n);
        }
    }
}
