package fase1;

import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StringList {

    public List<Integer> numList;

    //filter a given list according to the initial and string length
    public List<String> startWithCharFixedLength(List<String> source,Character a, Integer i){
        return source.stream()
                .filter(s -> s.charAt(0)==Character.toUpperCase(a))
                .filter(s -> s.length()==i)
                .collect(Collectors.toList());
    }

    //prefix e if even and o if odd to the integer and returns the source as a String List
    public List<String> oddEvenToStrList (List<Integer> source){
        return source.stream()
                .map(i-> i % 2 ==0 ? "e"+i : "o"+i)
                .collect(Collectors.toList());
    }

    public List<String> containsChar (List<String> source,Character a){
        return source.stream()
                .filter(s -> s.contains(Character.toString(a)))
                .collect(Collectors.toList());
    }

    public List<String> containsCharFixedLength (List<String> source,Character a, Integer i){
        return source.stream()
                .filter(s -> s.contains(Character.toString(a)))
                .filter(s -> s.length()>i)
                .collect(Collectors.toList());
    }

    //prints the values of Enum Month
    public static void monthsInYear(){
        Arrays.stream(Month.values())
                .forEach(m-> System.out.print(m+" "));
        System.out.println();
    }

    public static void monthsInYearRefMethod(){
        Arrays.stream(Month.values())
                .map(a->a+" ")
                .forEach(System.out::print);
        System.out.println();
    }


}
