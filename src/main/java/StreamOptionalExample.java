import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamOptionalExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", null, "Bob", "", "Charlie", "David", null);

        List<String> processedNames = names.stream()
                .map(StreamOptionalExample::processName) // Process each name
                .flatMap(Optional::stream) // Flatten the Optional to get rid of empty Optionals
                .collect(Collectors.toList()); // Collect the results stream into a list

        processedNames.forEach(System.out::println); // Print each name
    }

    public static Optional<String> processName(String name) {
        return Optional.ofNullable(name) // Create an Optional from the name
                .filter(n -> !n.isEmpty()) // Filter out empty strings
                .map(String::toUpperCase); // Convert the remaining names to uppercase
    }
}
