import java.util.HashSet;

public class PairwiseSummation {

//     6. С использованием множества выполнить попарное суммирование произвольного конечного ряда чисел по следующим правилам:
//        на первом этапе суммируются попарно рядом стоящие числа,
//        на втором этапе суммируются результаты первого этапа и т. д. до тех пор, пока не останется одно число.


    public double pairwiseSummation(HashSet<Double> setNumbs) {
        double sumOfElems = 0;

        for (Double num : setNumbs) {
            sumOfElems += num;
        }
        return sumOfElems;
    }
}
