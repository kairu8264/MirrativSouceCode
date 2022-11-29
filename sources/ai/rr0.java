package ai;

import android.content.Context;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class rr0 {

    /* renamed from: a  reason: collision with root package name */
    public final zj0 f9538a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f9539b;

    /* renamed from: c  reason: collision with root package name */
    public final WeakReference<Context> f9540c;

    public /* synthetic */ rr0(pr0 pr0Var, qr0 qr0Var) {
        zj0 zj0Var;
        Context context;
        WeakReference<Context> weakReference;
        zj0Var = pr0Var.f8529a;
        this.f9538a = zj0Var;
        context = pr0Var.f8530b;
        this.f9539b = context;
        weakReference = pr0Var.f8531c;
        this.f9540c = weakReference;
    }

    public final Context a() {
        return this.f9539b;
    }

    public final WeakReference<Context> b() {
        return this.f9540c;
    }

    public final zj0 c() {
        return this.f9538a;
    }

    public final String d() {
        return wg.t.d().P(this.f9539b, this.f9538a.f13013w);
    }

    public final u e() {
        return new u(new wg.i(this.f9539b, this.f9538a));
    }
}
