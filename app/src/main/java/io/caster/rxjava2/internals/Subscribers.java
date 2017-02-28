package io.caster.rxjava2.internals;


import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;
import timber.log.Timber;

public class Subscribers {

    public static Consumer<Integer> logInteger() {
        return new Consumer<Integer>() {
            @Override
            public void accept(@NonNull Integer integer) throws Exception {
                Timber.d("Integer: %d", integer);
            }
        };
    }
}
