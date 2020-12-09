import java.util.HashSet;

public class Main {

//     6. С использованием множества выполнить попарное суммирование произвольного конечного ряда чисел по следующим правилам:
//        на первом этапе суммируются попарно рядом стоящие числа,
//        на втором этапе суммируются результаты первого этапа и т. д. до тех пор, пока не останется одно число.


    public HashSet<Integer> pairwiseSummation(HashSet<Integer> setNumbs) {
        HashSet<Integer> integerHashSet = new HashSet<>();

        int i = 1;
        int sum = 0;
        for (Integer numb : setNumbs) {
            sum += numb;
            if (i % 2 == 0){
                integerHashSet.add(sum);
                System.out.println(sum);
                sum = 0;
            }
                i++;
        }
        return integerHashSet;
    }

    public static void main(String[] args) {

        HashSet<Integer> integersHashSet = new HashSet<>();

        integersHashSet.add(1);
        integersHashSet.add(2);
        integersHashSet.add(3);
        integersHashSet.add(4);
        integersHashSet.add(5);



        System.out.println(integersHashSet);
    }


}
