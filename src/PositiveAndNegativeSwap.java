import java.util.Comparator;
import java.util.List;

public class PositiveAndNegativeSwap {

    public static void posNegSwap(List<Integer> integers) {
        Comparator<Integer> comparator = (o1, o2) -> {
            if(o1 > 0 && o2 < 0) return 1;
            else if(o1 < 0 && o2 > 0) return -1;
            else return 0;
        };
        integers.sort(comparator);
    }
}
