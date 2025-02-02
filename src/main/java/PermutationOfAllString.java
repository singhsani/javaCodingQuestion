
public class PermutationOfAllString {
    public static void main(String[] args) {
        String str="ABCD";
        genratePermutation(str,0,str.length());
    }

    private static void genratePermutation(String str, int start, int end) {
        if(start==end-1){
            System.out.println(str);
        }else{
            for(int i=start;i<end;i++){
                str=swap(str,start,i);
                genratePermutation(str,start+1,end);
                str=swap(str,start,i);
            }
        }

    }

    private static String swap(String str, int start, int i) {
        char[] ch=str.toCharArray();
        char temp=ch[start];
        ch[start]=ch[i];
        ch[i]=temp;
        return String.valueOf(ch);
    }
}
