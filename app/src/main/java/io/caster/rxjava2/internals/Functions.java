package io.caster.rxjava2.internals;

import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Function;

public class Functions {

    public static Function<Integer, Integer> multiplyNumberBy2() {
        return new Function<Integer, Integer>() {
            @Override
            public Integer apply(@NonNull Integer number) throws Exception {
                return number * 2;
            }
        };
    }
}
