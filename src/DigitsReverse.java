import java.util.Stack;

public class DigitsReverse {

    public static void digitsReverse(int number) {

        String numb = String.valueOf(number);

        Stack<Character> digits = new Stack<>();
        String reverse = "";

        for(int i = 0; i < numb.length(); i++){
            digits.push(numb.charAt(i));
        }
        while (!digits.empty()) {
            reverse = reverse.concat(String.valueOf(digits.pop()));
        }
        System.out.println(reverse);
    }

    public static void main(String[] args) {
        digitsReverse(12345);

    }

}
