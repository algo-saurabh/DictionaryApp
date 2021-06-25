package algorithm.find;
import java.util.*;
public class SortFinder<T> implements Finder<T> {
    @Override
    public List<T> getOrderedElements(List<T> elements, Comparator<T> orderComparator,int num){
        Collections.sort(elements,orderComparator);
        List<T> result = new ArrayList<>();
        for(int i=0;i<num && i<elements.size();i++){
            result.add(elements.get(i));
        }
        return result;
    }
    
}
