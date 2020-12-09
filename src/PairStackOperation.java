import java.util.Stack;

public class PairStackOperation {

    public static void stackSwap(Stack<Integer> one, Stack<Integer> two) {
        Stack<Integer> copy = new Stack<>();
        copy.addAll(one);
        one.clear();
        one.addAll(two);
        two.clear();
        two.addAll(copy);
    }
}
