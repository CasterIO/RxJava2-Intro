package io.caster.rxjava2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import io.caster.rxjava2.internals.Functions;
import io.caster.rxjava2.internals.Subscribers;
import io.reactivex.Observable;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import timber.log.Timber;

import static io.caster.rxjava2.internals.Functions.*;
import static io.caster.rxjava2.internals.Subscribers.*;

public class IntroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        showANumberMultipliedBy2(3);
        showANumberMultipliedBy2(4);
        showANumberMultipliedBy2(5);
    }

    public void showANumberMultipliedBy2(int number) {

        Observable.just(number)
                .map(multiplyNumberBy2())
                .subscribe(logInteger(), logError(), logOnComplete());
    }
}
