package com.dena.mirrorman.customview;

import ae.gl;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.f;
import c3.a;
import jo.h;
import jo.p;
import nd.b1;
import nd.f1;
import nd.w0;
import nd.y0;

/* loaded from: classes2.dex */
public final class MyAppView extends ConstraintLayout {
    public final gl U;
    public boolean V;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MyAppView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p.h(context, "context");
    }

    public /* synthetic */ MyAppView(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public final void setMyApp(boolean z10) {
        this.V = z10;
        w();
    }

    public final void w() {
        if (this.V) {
            this.U.B.setBackgroundResource(y0.bg_added_to_my_app);
            this.U.C.setImageResource(y0.ic_checked);
            this.U.D.setText(f1.f41973g3);
            this.U.D.setTextColor(a.d(getContext(), w0.U0));
            return;
        }
        this.U.B.setBackgroundResource(y0.bg_add_to_my_app);
        this.U.C.setImageResource(y0.G0);
        this.U.D.setText(f1.f41970f3);
        this.U.D.setTextColor(a.d(getContext(), w0.f42242u0));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyAppView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        p.h(context, "context");
        this.U = (gl) f.e(LayoutInflater.from(context), b1.view_my_app, this, true);
    }
}
