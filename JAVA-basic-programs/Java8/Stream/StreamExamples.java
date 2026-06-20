package Java8.Stream;

import javax.xml.namespace.QName;
import java.awt.image.ImageProducer;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamExamples {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ABCD");
        list.add("YXA");
        list.add("ABCD");
        list.add("IOUI");
        list.add("MMAASA");

//        list.stream().
//                filter(s -> s.length() == 4).
//                forEach(s -> System.out.println("Elements with length 4: "+s));
        // filter() for to filter values

//        list.stream().
//                distinct().forEach(System.out::println);
        // distinct() for to get unique values

        //list.stream().limit(2).forEach(System.out::println);

        //given a list of string elements, create a Map, where Key is length of element and value will be element itself
        //if elements are unique but their length is same, use hashCode as Key

        Map<Integer, String> result = new HashMap<>();
////               list.stream().
////                distinct().collect(Collectors.toMap(String::length, Function.identity()));

        list.stream().distinct().forEach(str -> {
            int key = str.length();
            if(result.containsKey(key)) {
                key = str.hashCode();
            }
            result.put(key, str);
        });
        System.out.println(result);

        //Set<String> set = list.stream().collect(Collectors.toSet());
        // System.out.println(set);

//        List<Integer> length = list.stream().
//                map(s->s.length()).collect(Collectors.toList());
//        System.out.println(length);

//        Map<Integer, String> map = list.stream().collect(Collectors.
//                toMap(s-> s.length(), Function.identity(), (e, r) -> r));
//
//        System.out.println(map);

//        String result = list.stream().collect(Collectors.joining(", "));
//        System.out.println(result);
//        List<String> names = Arrays.asList("Amit","Deepa", "Ajay", "Deepak", "Nikhil");
//        Map<Character,List<String>> groupByLetter = names.stream().collect(Collectors.groupingBy(name -> name.charAt(0)));
//        System.out.println(groupByLetter);
//
//        Map<Integer, List<String>> groupBLength = names.stream().collect(Collectors.groupingBy(name -> name.length()));
//        System.out.println(groupBLength);


        System.out.println(list);
    }
}
