package androidx.compose.ui.platform;

import android.graphics.Rect;

/* loaded from: classes.dex */
public final class u1 {

    /* renamed from: a  reason: collision with root package name */
    public final w1.q f14665a;

    /* renamed from: b  reason: collision with root package name */
    public final Rect f14666b;

    public u1(w1.q qVar, Rect rect) {
        jo.p.h(qVar, "semanticsNode");
        jo.p.h(rect, "adjustedBounds");
        this.f14665a = qVar;
        this.f14666b = rect;
    }

    public final Rect a() {
        return this.f14666b;
    }

    public final w1.q b() {
        return this.f14665a;
    }
}
