package in.codebuffdev.release.java8.features.collectionenhancement.foreach;

import java.util.List;
import java.util.function.Consumer;

public class POCforEach{
    public static void main(String[] args) {
        List<String> fruits = List.of("Apple", "Banana", "Cherry");

        //Consumer function to print each fruit
         Consumer fruitConsumer = fruit -> System.out.println(fruit);

         // Consumer to print each fruit string size
        Consumer<String> fruitSizeConsumer = fruit -> System.out.println(fruit.length());

        // Using Java 8 forEach method to print each fruit
        fruits.forEach(fruitSizeConsumer);


    }
}
