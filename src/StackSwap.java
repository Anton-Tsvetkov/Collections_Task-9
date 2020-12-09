import java.util.Stack;

public class StackSwap {

    public static void stackSwap(Stack<Object> one, Stack<Object> two) {
        Object copyOne = one.clone();
        Object copyTwo = two.clone();
        one = (Stack<Object>) copyTwo;
        two = (Stack<Object>) copyOne;
    }
}
