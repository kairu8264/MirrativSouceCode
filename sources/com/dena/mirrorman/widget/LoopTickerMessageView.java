package com.dena.mirrorman.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import jo.p;
import nd.h1;

/* loaded from: classes3.dex */
public final class LoopTickerMessageView extends FrameLayout {

    /* renamed from: w  reason: collision with root package name */
    public int f26366w;

    /* renamed from: x  reason: collision with root package name */
    public int f26367x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoopTickerMessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.h(context, "context");
        a(context, attributeSet);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, h1.B1, 0, 0);
        p.g(obtainStyledAttributes, "context.theme.obtainStyl…,\n            0\n        )");
        try {
            this.f26366w = obtainStyledAttributes.getInt(h1.C1, 0);
            this.f26367x = obtainStyledAttributes.getResourceId(h1.D1, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
