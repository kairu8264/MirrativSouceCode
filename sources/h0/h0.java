package h0;

/* loaded from: classes.dex */
public final class h0<T> {

    /* renamed from: a  reason: collision with root package name */
    public final T f33895a;

    /* renamed from: b  reason: collision with root package name */
    public final io.q<io.p<? super l0.i, ? super Integer, wn.v>, l0.i, Integer, wn.v> f33896b;

    /* JADX WARN: Multi-variable type inference failed */
    public h0(T t10, io.q<? super io.p<? super l0.i, ? super Integer, wn.v>, ? super l0.i, ? super Integer, wn.v> qVar) {
        jo.p.h(qVar, "transition");
        this.f33895a = t10;
        this.f33896b = qVar;
    }

    public final T a() {
        return this.f33895a;
    }

    public final io.q<io.p<? super l0.i, ? super Integer, wn.v>, l0.i, Integer, wn.v> b() {
        return this.f33896b;
    }

    public final T c() {
        return this.f33895a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h0) {
            h0 h0Var = (h0) obj;
            return jo.p.c(this.f33895a, h0Var.f33895a) && jo.p.c(this.f33896b, h0Var.f33896b);
        }
        return false;
    }

    public int hashCode() {
        T t10 = this.f33895a;
        return ((t10 == null ? 0 : t10.hashCode()) * 31) + this.f33896b.hashCode();
    }

    public String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.f33895a + ", transition=" + this.f33896b + ')';
    }
}
