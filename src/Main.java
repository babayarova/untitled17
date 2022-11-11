import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<Integer>set1=new HashSet<>();
        set1.add(0);
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer>set2=new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);

        symmetricDifference(set1,set2);


    }
    public static void symmetricDifference(Set<Integer>set1,Set<Integer>set2){
        Set<Integer>integers=new HashSet<>(set1);
        integers.removeAll(set2);
        set2.removeAll(set1);
        integers.addAll(set2);
        System.out.println(integers);
    }

}