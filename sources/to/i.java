package to;

import jo.p;

/* loaded from: classes4.dex */
public final class i<T> {

    /* renamed from: a  reason: collision with root package name */
    public final T f53897a;

    /* renamed from: b  reason: collision with root package name */
    public final long f53898b;

    public i(T t10, long j10) {
        this.f53897a = t10;
        this.f53898b = j10;
    }

    public /* synthetic */ i(Object obj, long j10, jo.h hVar) {
        this(obj, j10);
    }

    public final long a() {
        return this.f53898b;
    }

    public final T b() {
        return this.f53897a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return p.c(this.f53897a, iVar.f53897a) && a.l(this.f53898b, iVar.f53898b);
        }
        return false;
    }

    public int hashCode() {
        T t10 = this.f53897a;
        return ((t10 == null ? 0 : t10.hashCode()) * 31) + a.x(this.f53898b);
    }

    public String toString() {
        return "TimedValue(value=" + this.f53897a + ", duration=" + ((Object) a.D(this.f53898b)) + ')';
    }
}
