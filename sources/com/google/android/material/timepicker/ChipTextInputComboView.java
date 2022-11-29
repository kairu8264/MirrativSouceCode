package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import nj.i;
import wi.f;
import wi.h;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class ChipTextInputComboView extends FrameLayout implements Checkable {
    public TextView A;

    /* renamed from: w  reason: collision with root package name */
    public final Chip f27846w;

    /* renamed from: x  reason: collision with root package name */
    public final TextInputLayout f27847x;

    /* renamed from: y  reason: collision with root package name */
    public final EditText f27848y;

    /* renamed from: z  reason: collision with root package name */
    public TextWatcher f27849z;

    /* loaded from: classes3.dex */
    public class b extends i {
        public b() {
        }

        @Override // nj.i, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.f27846w.setText(ChipTextInputComboView.this.c("00"));
            } else {
                ChipTextInputComboView.this.f27846w.setText(ChipTextInputComboView.this.c(editable));
            }
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final String c(CharSequence charSequence) {
        return c.a(getResources(), charSequence);
    }

    public final void d() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f27848y.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f27846w.isChecked();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        d();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        this.f27846w.setChecked(z10);
        this.f27848y.setVisibility(z10 ? 0 : 4);
        this.f27846w.setVisibility(z10 ? 8 : 0);
        if (isChecked()) {
            this.f27848y.requestFocus();
            if (TextUtils.isEmpty(this.f27848y.getText())) {
                return;
            }
            EditText editText = this.f27848y;
            editText.setSelection(editText.getText().length());
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f27846w.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i10, Object obj) {
        this.f27846w.setTag(i10, obj);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.f27846w.toggle();
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(h.f58872j, (ViewGroup) this, false);
        this.f27846w = chip;
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(h.f58873k, (ViewGroup) this, false);
        this.f27847x = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f27848y = editText;
        editText.setVisibility(4);
        b bVar = new b();
        this.f27849z = bVar;
        editText.addTextChangedListener(bVar);
        d();
        addView(chip);
        addView(textInputLayout);
        this.A = (TextView) findViewById(f.f58848n);
        editText.setSaveEnabled(false);
    }
}
