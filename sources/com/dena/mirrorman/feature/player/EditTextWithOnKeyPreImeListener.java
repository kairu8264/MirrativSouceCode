package com.dena.mirrorman.feature.player;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import androidx.appcompat.widget.AppCompatEditText;
import io.p;
import wn.v;

/* loaded from: classes2.dex */
public final class EditTextWithOnKeyPreImeListener extends AppCompatEditText {

    /* renamed from: w  reason: collision with root package name */
    public p<? super Integer, ? super KeyEvent, v> f25946w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditTextWithOnKeyPreImeListener(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        jo.p.h(context, "context");
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
        jo.p.h(keyEvent, "event");
        p<? super Integer, ? super KeyEvent, v> pVar = this.f25946w;
        if (pVar != null) {
            pVar.invoke(Integer.valueOf(i10), keyEvent);
        }
        return super.onKeyPreIme(i10, keyEvent);
    }

    public final void setOnKeyPreImeListener(p<? super Integer, ? super KeyEvent, v> pVar) {
        jo.p.h(pVar, "onKeyPreImeListener");
        this.f25946w = pVar;
    }
}
