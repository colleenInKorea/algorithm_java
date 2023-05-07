package Day02.Test03;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        System.out.println(str.repeat(n));
//        StringBuilder stb = new StringBuilder();
//        for (int i = 0; i < n; n++){
//            stb.append(str);
//        }
//        String a = stb.toString();
//        System.out.println(a);
    }
}