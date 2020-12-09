import java.util.HashSet;
import java.util.Set;

public class SetsIntersectionAndUnion {

    public static Set<Integer> intersectionSets(Set<Integer> one, Set<Integer> two){
        Set<Integer> intersectionSet = new HashSet<>();
        for(Integer numb : one){
            if(two.contains(numb)) intersectionSet.add(numb);
        }
        return  intersectionSet;
    }

    public static Set<Integer> unionSets(Set<Integer> one, Set<Integer> two){
        Set<Integer> unionSet = new HashSet<>(one);
        unionSet.addAll(two);
        return unionSet;
    }




}
