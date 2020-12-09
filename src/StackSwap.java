import java.util.Stack;

public class StackSwap {

    public static void stackSwap(Stack<Integer> one, Stack<Integer> two) {
        Object copyOne = one.clone();
        Object copyTwo = two.clone();
        one = (Stack<Integer>) copyTwo;
        two = (Stack<Integer>) copyOne;
    }


    public static void main(String[] args) {


    }

}
