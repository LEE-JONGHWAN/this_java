package sec05.exam07_andthen_compose;

import java.math.BigDecimal;
import java.util.function.BiFunction;
import java.util.function.Function;

public class AndThenExample {

    public static void main(String... args) {
        BiFunction<Double, String, Long> adderToLong = (d, s) ->
                (long) (d + Long.parseLong(s));

        Function<Long, BigDecimal> bigDecimalConverter = l -> BigDecimal.valueOf(l);

        BiFunction<Double, String, BigDecimal> biFunction = adderToLong
                .andThen(bigDecimalConverter);

        BigDecimal bd = biFunction.apply(20.33d, "34");
        System.out.println(bd);
    }
}