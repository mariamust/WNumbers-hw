import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamMain {

    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        Stream<Integer> stream1 = intList.stream();
        Stream<Integer> stream2 = stream1.filter(x -> x > 0);
        Stream<Integer> stream3 = stream2.filter(x -> x % 2 == 0);
        Stream<Integer> stream4 = stream3.sorted(Comparator.naturalOrder());
        stream4.forEach(System.out::println);

    }

}