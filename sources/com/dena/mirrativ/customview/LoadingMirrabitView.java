package com.dena.mirrativ.customview;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.databinding.f;
import jo.h;
import jo.p;
import m9.e;

/* loaded from: classes.dex */
public final class LoadingMirrabitView extends FrameLayout {

    /* renamed from: w  reason: collision with root package name */
    public final e f20783w;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoadingMirrabitView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p.h(context, "context");
    }

    public /* synthetic */ LoadingMirrabitView(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadingMirrabitView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        p.h(context, "context");
        e eVar = (e) f.e(LayoutInflater.from(context), h9.e.view_loading_mirrabit, this, true);
        this.f20783w = eVar;
        Drawable background = eVar.B.getBackground();
        p.f(background, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
        ((AnimationDrawable) background).start();
    }
}
