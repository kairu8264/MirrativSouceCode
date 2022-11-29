package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final b f27528a;

    /* renamed from: b  reason: collision with root package name */
    public final b f27529b;

    /* renamed from: c  reason: collision with root package name */
    public final b f27530c;

    /* renamed from: d  reason: collision with root package name */
    public final b f27531d;

    /* renamed from: e  reason: collision with root package name */
    public final b f27532e;

    /* renamed from: f  reason: collision with root package name */
    public final b f27533f;

    /* renamed from: g  reason: collision with root package name */
    public final b f27534g;

    /* renamed from: h  reason: collision with root package name */
    public final Paint f27535h;

    public c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(qj.b.c(context, wi.b.f58787x, h.class.getCanonicalName()), wi.l.f59087r3);
        this.f27528a = b.a(context, obtainStyledAttributes.getResourceId(wi.l.f59114u3, 0));
        this.f27534g = b.a(context, obtainStyledAttributes.getResourceId(wi.l.f59096s3, 0));
        this.f27529b = b.a(context, obtainStyledAttributes.getResourceId(wi.l.f59105t3, 0));
        this.f27530c = b.a(context, obtainStyledAttributes.getResourceId(wi.l.f59123v3, 0));
        ColorStateList a10 = qj.c.a(context, obtainStyledAttributes, wi.l.f59132w3);
        this.f27531d = b.a(context, obtainStyledAttributes.getResourceId(wi.l.f59150y3, 0));
        this.f27532e = b.a(context, obtainStyledAttributes.getResourceId(wi.l.f59141x3, 0));
        this.f27533f = b.a(context, obtainStyledAttributes.getResourceId(wi.l.f59159z3, 0));
        Paint paint = new Paint();
        this.f27535h = paint;
        paint.setColor(a10.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
