package wn;

import java.io.Serializable;

/* loaded from: classes4.dex */
public final class o<T> implements f<T>, Serializable {

    /* renamed from: w  reason: collision with root package name */
    public io.a<? extends T> f59230w;

    /* renamed from: x  reason: collision with root package name */
    public volatile Object f59231x;

    /* renamed from: y  reason: collision with root package name */
    public final Object f59232y;

    public o(io.a<? extends T> aVar, Object obj) {
        jo.p.h(aVar, "initializer");
        this.f59230w = aVar;
        this.f59231x = u.f59241a;
        this.f59232y = obj == null ? this : obj;
    }

    public boolean a() {
        return this.f59231x != u.f59241a;
    }

    @Override // wn.f
    public T getValue() {
        T t10;
        T t11 = (T) this.f59231x;
        u uVar = u.f59241a;
        if (t11 != uVar) {
            return t11;
        }
        synchronized (this.f59232y) {
            t10 = (T) this.f59231x;
            if (t10 == uVar) {
                io.a<? extends T> aVar = this.f59230w;
                jo.p.e(aVar);
                t10 = aVar.invoke();
                this.f59231x = t10;
                this.f59230w = null;
            }
        }
        return t10;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ o(io.a aVar, Object obj, int i10, jo.h hVar) {
        this(aVar, (i10 & 2) != 0 ? null : obj);
    }
}
