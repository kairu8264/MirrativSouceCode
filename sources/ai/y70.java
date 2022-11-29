package ai;

import android.content.Context;

/* loaded from: classes3.dex */
public final class y70 {

    /* renamed from: b  reason: collision with root package name */
    public static final yg.f0<e60> f12474b = new w70();

    /* renamed from: c  reason: collision with root package name */
    public static final yg.f0<e60> f12475c = new x70();

    /* renamed from: a  reason: collision with root package name */
    public final k70 f12476a;

    public y70(Context context, zj0 zj0Var, String str) {
        this.f12476a = new k70(context, zj0Var, str, f12474b, f12475c);
    }

    public final <I, O> n70<I, O> a(String str, q70<I> q70Var, p70<O> p70Var) {
        return new c80(this.f12476a, str, q70Var, p70Var);
    }

    public final h80 b() {
        return new h80(this.f12476a);
    }
}
