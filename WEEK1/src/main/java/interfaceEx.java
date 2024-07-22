import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

interface A{
    void show();

}
interface B{
    void add(int a,int b);
}
interface C{
    int minus(int a,int b);

}
@FunctionalInterface
interface D{
    void done();

        }

class InterfaceEx{
    public static void main(String[] args) {
        A obj=() -> System.out.println("hi from show");
        A t=()->System.out.println("hi from 2nd");
     t.show();

        B ins=(int i,int j) ->  System.out.println(i+j);
//        C pt=(int x,int y)->{
//            return  x-y; //if only one line is their then we can remove the curly braces
//        };

        C pt=(x, y)->  x-y; //if only one line is their then we can remove the curly braces




        D p1=new D()
        {
            public void done()
            {
                System.out.println("hi from functional interface inner class or anonymous class");
            }
        };



        p1.done();

      obj.show();
      ins.add(3,8);
      List<Integer> ar= Arrays.asList(8, 9, 3, 2, 1);

      ar.forEach(n->System.out.print("\n"+n));

    //stream filter reduced sorted parallstream count map
        List<Integer> numbers = List.of(8, 15, 23, 42, 5, 16, 9, 12, 6, 3);

        List<String> words = List.of("Elephant", "Giraffe", "Hippo", "Kangaroo");

        // Stream program for printing sum of odd numbers using reduce
        int oddSum = numbers.stream().filter(n -> n % 2 == 1).reduce(0, Integer::sum);
        System.out.println("Sum of odd numbers: " + oddSum);

        // Stream program for printing sum of even numbers using reduce
        int evenSum = numbers.stream().filter(n -> n % 2 == 0).reduce(0, Integer::sum);
        System.out.println("Sum of even numbers: " + evenSum);

        // Intermediate operations in stream

        // Sort the list
        System.out.println("Sorted numbers:");
        numbers.stream().sorted().forEach(System.out::println);

        // Sort the distinct list
        System.out.println("Distinct and sorted numbers:");
        numbers.stream().distinct().sorted().forEach(System.out::println);

        // Sort the distinct list with elements squared
        System.out.println("Distinct, sorted, and squared numbers:");
        numbers.stream().distinct().sorted().map(n -> n * n).forEach(System.out::println);

        // Print the squares of the first 10 natural numbers and collect into a list
        List<Integer> squares = IntStream.range(1, 11).map(n -> n * n).boxed().collect(Collectors.toList());
        System.out.println("Squares of the first 10 natural numbers as a list:");
        System.out.println(squares);

        // Print the string list with all elements in uppercase
        System.out.println("Words in uppercase:");
        words.stream().map(String::toUpperCase).forEach(System.out::println);

        // Print the length of each element in the string list
        System.out.println("Length of each word:");
        words.stream().map(String::length).forEach(System.out::println);

        // Terminal operation on stream to find max using comparator
        int max = numbers.stream().max(Integer::compare).orElseThrow();
        System.out.println("Max number: " + max);

        // Returning the filtered and sorted even numbers as a list
        System.out.println("Filtered and sorted even numbers:");
        List<Integer> evenNumbers = numbers.stream().sorted().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumbers);
    }
}