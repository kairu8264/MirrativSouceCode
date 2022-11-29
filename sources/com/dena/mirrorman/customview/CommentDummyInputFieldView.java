package com.dena.mirrorman.customview;

import ae.c9;
import android.content.Context;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.f;
import com.dena.mirrorman.customview.CommentDummyInputFieldView;
import io.a;
import jo.h;
import jo.p;
import nd.b1;
import wn.v;

/* loaded from: classes2.dex */
public final class CommentDummyInputFieldView extends LinearLayout {

    /* renamed from: w  reason: collision with root package name */
    public final c9 f25327w;

    /* renamed from: x  reason: collision with root package name */
    public CharSequence f25328x;

    /* renamed from: y  reason: collision with root package name */
    public CharSequence f25329y;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CommentDummyInputFieldView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p.h(context, "context");
    }

    public /* synthetic */ CommentDummyInputFieldView(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public static final void c(a aVar, View view) {
        p.h(aVar, "$listener");
        aVar.invoke();
    }

    public final void b(TextWatcher textWatcher) {
        p.h(textWatcher, "textWatcher");
        this.f25327w.B.addTextChangedListener(textWatcher);
    }

    public final CharSequence getHint() {
        return this.f25327w.B.getHint();
    }

    public final CharSequence getText() {
        return this.f25327w.B.getText();
    }

    @Override // android.view.View
    public void setClickable(boolean z10) {
        super.setClickable(z10);
        this.f25327w.B.setClickable(z10);
    }

    public final void setHint(CharSequence charSequence) {
        this.f25327w.B.setHint(charSequence);
        this.f25329y = charSequence;
    }

    public final void setText(CharSequence charSequence) {
        this.f25327w.B.setText(charSequence);
        this.f25328x = charSequence;
    }

    public final void setTextFieldOnClickListener(final a<v> aVar) {
        p.h(aVar, "listener");
        this.f25327w.B.setOnClickListener(new View.OnClickListener() { // from class: yd.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CommentDummyInputFieldView.c(io.a.this, view);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentDummyInputFieldView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        p.h(context, "context");
        c9 c9Var = (c9) f.e(LayoutInflater.from(context), b1.view_comment_dummy_input_field, this, true);
        this.f25327w = c9Var;
        this.f25328x = c9Var.B.getText();
        this.f25329y = c9Var.B.getHint();
    }
}
