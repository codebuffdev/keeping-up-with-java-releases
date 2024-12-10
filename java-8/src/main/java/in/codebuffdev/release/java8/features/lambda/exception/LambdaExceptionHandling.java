package in.codebuffdev.release.java8.features.lambda.exception;

import java.util.Arrays;
import java.util.List;

public class LambdaExceptionHandling {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("10", "20", "321", "e3e");
        /**
         *List<Integer> integerList = list.stream().map(Integer::parseInt).collect(Collectors.toList());
         *integerList.forEach(System.out::println);*/

        /** Handling exception */
        /**
         * Approach 1
         list.stream().forEach(s->{
         try{
         System.out.println(Integer.parseInt(s));
         }catch (NumberFormatException nfe){
         System.err.println(nfe.getMessage());
         }
         });
         */
        list.forEach(LambdaExceptionHandling::printList);
    }

    /** Approach 2 */
    public static void printList(String s) {
        try {
            System.out.println(Integer.parseInt(s));
        } catch (NumberFormatException nfe) {
            System.err.println(nfe.getMessage());
        }
    }
}
