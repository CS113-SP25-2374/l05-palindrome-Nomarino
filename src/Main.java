public class Main {
    public static void main(String[] args) {
        String racecar = "RACECAR";
        Palindrome tester = new Palindrome();

        boolean isPalindrome = tester.isPalindrome(racecar);

        if (isPalindrome){
            System.out.println("It's a palindrome!");
        } else {
            System.out.println("It's not a palindrome!");
        }



        System.out.println("Hello world!");
    }
}