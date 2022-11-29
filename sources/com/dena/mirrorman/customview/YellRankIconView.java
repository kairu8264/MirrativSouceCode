package com.dena.mirrorman.customview;

import ae.sn;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import c3.a;
import jo.p;
import nd.w0;
import we.g;

/* loaded from: classes2.dex */
public final class YellRankIconView extends FrameLayout {

    /* renamed from: w  reason: collision with root package name */
    public final sn f25632w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YellRankIconView(Context context) {
        super(context);
        p.h(context, "context");
        sn T = sn.T(LayoutInflater.from(getContext()), this, true);
        p.g(T, "inflate(\n        LayoutI… this,\n        true\n    )");
        this.f25632w = T;
    }

    public final void a(g gVar, Integer num) {
        setVisibility((gVar == g.NONE || gVar == null) ? 8 : 0);
        if (gVar == null || num == null) {
            return;
        }
        num.intValue();
        ConstraintLayout constraintLayout = this.f25632w.C;
        Context context = getContext();
        Integer l10 = gVar.l();
        if (l10 != null) {
            constraintLayout.setBackground(a.f(context, l10.intValue()));
            AppCompatImageView appCompatImageView = this.f25632w.D;
            Context context2 = getContext();
            Integer m10 = gVar.m();
            if (m10 != null) {
                appCompatImageView.setImageDrawable(a.f(context2, m10.intValue()));
                this.f25632w.B.setText(num.toString());
                this.f25632w.B.setTextColor(a.d(getContext(), gVar.n() ? gVar.p() : w0.U0));
            }
        }
    }

    public final Bitmap b() {
        measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        Bitmap createBitmap = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
        draw(canvas);
        p.g(createBitmap, "bitmap");
        return createBitmap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YellRankIconView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.h(context, "context");
        p.h(attributeSet, "attrs");
        sn T = sn.T(LayoutInflater.from(getContext()), this, true);
        p.g(T, "inflate(\n        LayoutI… this,\n        true\n    )");
        this.f25632w = T;
    }
}
