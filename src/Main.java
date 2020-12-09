import java.util.HashSet;
import java.util.Set;

public class Main {

    public static Set<Integer> pairwiseSummation(Set<Integer> setNumbs) {
        Set<Integer> halfSetNumbs = new HashSet<>();
        int i = 1;
        int sum = 0;
        if (setNumbs.size() == 1) {
            return setNumbs;
        } else {
            for (Integer numb : setNumbs) {
                sum += numb;
                if (i % 2 == 0) {
                    halfSetNumbs.add(sum);
                    sum = 0;
                }
                if (i == setNumbs.size() && setNumbs.size() > 2) halfSetNumbs.add(numb);
                i++;
            }
            halfSetNumbs = pairwiseSummation(halfSetNumbs);
            return halfSetNumbs;
        }
    }

    public static void main(String[] args) {

        Set<Integer> integersHashSet = new HashSet<>();
        for (int i = 1; i <= 9; i++) {
            integersHashSet.add(i);
        }

        System.out.println(pairwiseSummation(integersHashSet));
    }
}
