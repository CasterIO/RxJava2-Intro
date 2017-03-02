package io.caster.rxjava2.internals;


import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Action;
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

    public static Consumer<Throwable> logError() {
        return new Consumer<Throwable>() {
            @Override
            public void accept(@NonNull Throwable throwable) throws Exception {
                Timber.e(throwable);
            }
        };
    }

    public static Action logOnComplete() {
        return new Action() {
            @Override
            public void run() throws Exception {
                Timber.d("onComplete() has been called");
            }
        };
    }
}
