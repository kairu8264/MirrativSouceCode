package lq;

import androidx.lifecycle.q0;
import androidx.lifecycle.t0;
import jo.p;
import kq.b;

/* loaded from: classes4.dex */
public final class a<T extends q0> implements t0.b {

    /* renamed from: a  reason: collision with root package name */
    public final xq.a f40438a;

    /* renamed from: b  reason: collision with root package name */
    public final b<T> f40439b;

    public a(xq.a aVar, b<T> bVar) {
        p.h(aVar, "scope");
        p.h(bVar, "parameters");
        this.f40438a = aVar;
        this.f40439b = bVar;
    }

    @Override // androidx.lifecycle.t0.b
    public <T extends q0> T a(Class<T> cls) {
        p.h(cls, "modelClass");
        return (T) this.f40438a.c(this.f40439b.a(), this.f40439b.c(), this.f40439b.b());
    }
}
