package com.unuuu.android.viewgenerator.sample;

import com.unuuu.android.viewgenerator.annotations.LogField;
import com.unuuu.android.viewgenerator.annotations.Loggable;

@Loggable
public class MyModel {
    @LogField
    public String foo;
    @LogField
    public int bar;

    public MyModel(String foo, int bar) {
        this.foo = foo;
        this.bar = bar;
    }
}
