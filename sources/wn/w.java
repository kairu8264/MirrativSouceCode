package wn;

import java.io.Serializable;

/* loaded from: classes4.dex */
public final class w<T> implements f<T>, Serializable {

    /* renamed from: w  reason: collision with root package name */
    public io.a<? extends T> f59243w;

    /* renamed from: x  reason: collision with root package name */
    public Object f59244x;

    public w(io.a<? extends T> aVar) {
        jo.p.h(aVar, "initializer");
        this.f59243w = aVar;
        this.f59244x = u.f59241a;
    }

    public boolean a() {
        return this.f59244x != u.f59241a;
    }

    @Override // wn.f
    public T getValue() {
        if (this.f59244x == u.f59241a) {
            io.a<? extends T> aVar = this.f59243w;
            jo.p.e(aVar);
            this.f59244x = aVar.invoke();
            this.f59243w = null;
        }
        return (T) this.f59244x;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
