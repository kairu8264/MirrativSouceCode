package com.dena.mirrorman.customview;

import ae.ca;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.databinding.f;
import jo.h;
import jo.p;
import nd.b1;
import nd.h1;

/* loaded from: classes2.dex */
public final class FollowTextView extends LinearLayout {

    /* renamed from: w  reason: collision with root package name */
    public final ca f25340w;

    /* renamed from: x  reason: collision with root package name */
    public int f25341x;

    /* renamed from: y  reason: collision with root package name */
    public String f25342y;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FollowTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p.h(context, "context");
    }

    public /* synthetic */ FollowTextView(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public final int getCount() {
        return this.f25341x;
    }

    public final String getLabel() {
        return this.f25342y;
    }

    public final void setCount(int i10) {
        this.f25341x = i10;
        this.f25340w.B.setText(String.valueOf(i10));
    }

    public final void setLabel(String str) {
        this.f25342y = str;
        this.f25340w.C.setText(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FollowTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        p.h(context, "context");
        this.f25340w = (ca) f.e(LayoutInflater.from(context), b1.view_follow_text, this, true);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h1.C0, 0, 0);
            setLabel(obtainStyledAttributes.getString(h1.D0));
            obtainStyledAttributes.recycle();
        }
        this.f25342y = "";
    }
}
