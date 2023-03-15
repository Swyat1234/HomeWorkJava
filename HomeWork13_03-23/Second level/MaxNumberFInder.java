package HomeWork13_03_23;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class MaxNumberFInder {
    public <T> T max(List<T> list, Comparator<T> comparator){
        T max = null;
        for (T value :list) {
            if(max == null || comparator.compare(value,max) > 0){
                max = value;
            }
        }
        return max;
    }
    public static class Comp implements Comparator<Integer>{

        @Override
        public int compare(Integer o1, Integer o2) {
            return o1.compareTo(o2);
        }
    }

    public <T extends Comparable<T>> T maxElement(List<T > list){
        T max = null;
        for (T value :list) {
            if(max == null || value.compareTo(max) > 0){
                max = value;
            }
        }
        return max;
    }

    public <T extends Comparable<T>> T maxElementCollection(Collection<T> collection){
        T max = null;
        for (T value :collection) {
            if(max == null || value.compareTo(max) > 0){
                max = value;
            }
        }
        return max;
    }
}

