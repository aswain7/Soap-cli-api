package org.examples2;



import java.util.Arrays;
import java.util.List;

public class LearnStreams2 {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("rajdeep","alasksa","soumya","rajashree","soumyashree");
        names.stream().filter(n->n.length()>6 && n.length()<9).forEach(n-> System.out.print(n+" "));
    }
}
