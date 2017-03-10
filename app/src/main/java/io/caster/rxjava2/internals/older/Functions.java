package io.caster.rxjava2.internals.older;

import rx.functions.Func1;

public class Functions {

    public static Func1<Integer, Integer> multiplyNumberBy2() {
        return new Func1<Integer, Integer>() {
            @Override
            public Integer call(Integer number) {
                return number * 2;
            }
        };
    }
}
