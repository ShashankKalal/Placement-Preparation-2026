public class Palindrome {
    public static void main(String args[]) {
        int num = 121, r , s = 0;
        int t = num;
        while(num > 0) {
            r = num % 10;
            num = num / 10;
            s = s * 10 + r;
        }
        if(t == s) {
            System.out.println(t + " is a palindrome.");
        } else {
            System.out.println(t + " is not a palindrome.");
        }
    }
    
}
