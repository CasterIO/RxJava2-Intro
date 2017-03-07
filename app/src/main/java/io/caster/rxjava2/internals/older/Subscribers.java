package io.caster.rxjava2.internals.older;


import io.reactivex.annotations.NonNull;
import rx.functions.Action0;
import rx.functions.Action1;
import timber.log.Timber;

public class Subscribers {

    public static Action1<Integer> logInteger() {
        return new Action1<Integer>() {
            @Override
            public void call(Integer integer) {
                Timber.d("Integer: %d", integer);
            }
        };
    }

    public static Action1<Throwable> logError() {
        return new Action1<Throwable>() {
            @Override
            public void call(@NonNull Throwable throwable) {
                Timber.e(throwable);
            }
        };
    }

    public static Action0 logOnComplete() {
        return new Action0() {
            @Override
            public void call() {
                Timber.d("onComplete() has been called");
            }
        };
    }
}
