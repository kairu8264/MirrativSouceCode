package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import e.h;
import ej.a;
import xj.e;

/* loaded from: classes3.dex */
public class MaterialComponentsViewInflater extends h {
    @Override // e.h
    public AppCompatAutoCompleteTextView c(Context context, AttributeSet attributeSet) {
        return new e(context, attributeSet);
    }

    @Override // e.h
    public AppCompatButton d(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // e.h
    public AppCompatCheckBox e(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }

    @Override // e.h
    public AppCompatRadioButton k(Context context, AttributeSet attributeSet) {
        return new pj.a(context, attributeSet);
    }

    @Override // e.h
    public AppCompatTextView o(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
