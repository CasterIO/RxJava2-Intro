package io.caster.rxjava2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import io.reactivex.Observable;

import static io.caster.rxjava2.internals.Functions.multiplyNumberBy2;
import static io.caster.rxjava2.internals.Subscribers.logError;
import static io.caster.rxjava2.internals.Subscribers.logInteger;
import static io.caster.rxjava2.internals.Subscribers.logOnComplete;


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
