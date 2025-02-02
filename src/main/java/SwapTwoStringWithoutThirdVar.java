public class SwapTwoStringWithoutThirdVar {
    public static void main(String[] args) {
        String a="Helloooooo";
        String b="worlds";
        a=a+b;
        b=a.substring(0,a.length()-b.length());
        a=a.substring(b.length());
        System.out.println(a+" "+b);

        System.out.println("------Second Approche-------");
        String str1="Hello";
        String str2="World";
        str1=str1+str2;
        str2=str1.replace(str2,"");
        str1=str1.replace(str2,"");
        System.out.println(str1+" "+str2);
    }
}
