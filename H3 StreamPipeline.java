import java.util.ArrayList;
import java.util.stream.Collectors;

public class StreamPipeline {
    public static void main(String[] args) {
        ArrayList<Double> prices = new ArrayList<Double>();
        ArrayList<Double> lowPrices = new ArrayList<Double>();

        // add values to the arraylist.

        prices.add(1.99);
        prices.add(4.99);
        prices.add(10.99);
        prices.add(15.99);

        // stream pipeline.

        /*
         * .filter -> return those elements thats satisfy the condition.
         * .forEach -> prints all the updated values.
         * .collect(Collector.toList()) -> return the values.
         * .map -> it operated on every element and return it.
         * .sum() -> sum all the return values.
         * 
         */

        prices.stream()
                .filter((price) -> price < 5)
                .forEach((price) -> System.out.println(price));

        lowPrices.addAll(
                prices.stream().map((price) -> price * 5).collect(Collectors.toList()));
    }
}
